package classical.classes;

import classical.gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by cooper on 03.04.15.
 */

public class Chipher {
    private String shift;
    private ArrayList<String[]> str = new ArrayList<String[]>();
    private ArrayList<ArrayList<Character>> shiftIndex = new ArrayList<ArrayList<Character>>();

    public Chipher() {

    }

    public void setShift(String shift) {
        this.shift = shift;
        shapeArr(shift);
    }

    public String getEncryptMessage(String message) {
        String encrypt = "";
        for (int i = 0; i < message.length(); i++) {
                encrypt += getIndex(message.charAt(i)) + " ";
            }
        return encrypt;
    }

    public String getDecryptMessage(String message) {
        //разд строк
        String delimiter = " ";

        String temp[] = message.split(delimiter);
        for (int i = 0; i < temp.length; i++) {
            //System.out.println(temp[i] + " ");
        }
        String decrypt = "";
        for (int i = 0; i < temp.length; i++) {
            decrypt += getChar(getFirstIndex(temp[i]),getDoubleIndex(temp[i]));
        }
        System.out.println("firsind " + getFirstIndex(temp[0]));
        System.out.println("dousind " + getDoubleIndex(temp[0]));

        return decrypt;
    }

    private int getFirstIndex(String s) {
        String str;
        str = s.substring(0,2);
        return new Integer(str);
    }

    private int getDoubleIndex(String s) {
        String str;
        str = s.substring(2,4);
        return new Integer(str);
    }

    private int getNumberNewLine(String s) {
        int numberCount = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '\n') {
                numberCount++;
            }
        }
        return numberCount;
    }

    private int getMaxRowLength(String[] s) {
        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                count++;
                if(count > maxLength) {
                    maxLength = count;
                }
            }
            count = 0;
        }
        return maxLength;
    }

    private int getCurrentRowLength(String[] s,int row) {
        return s[row].length();
    }


    private void shapeArr(String s) {

        String[] array = {"0"};
        for (int i = 0; i < getNumberNewLine(s); i++) {
            array = s.split(System.getProperty("line.separator"));
        }

        for (int i = 0; i < array.length; i++) {
            ArrayList<Character> row = new ArrayList<Character>();
            for (int j = 0; j < getMaxRowLength(array)+1; j++) {
                if(j<getCurrentRowLength(array, i)) {
                    row.add(j,array[i].charAt(j));
                }
                else if(j == getMaxRowLength(array)) {
                        row.add(j,'\n');
                }
                else {
                    row.add(j,'0');
                }
            }
            shiftIndex.add(i, row);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < getMaxRowLength(array) + 1; j++) {
                System.out.print(shiftIndex.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
    private String getIndex(char ch) {
        ArrayList<String> str = new ArrayList<String>();
        int k = 0;
        for (int i = 0; i < shiftIndex.size(); i++) {
            for (int j = 0; j < shiftIndex.get(i).size(); j++) {
                if(shiftIndex.get(i).get(j) == ch) {
                    Integer i1 = i+10;
                    Integer j1 = j+10;
                    String s1 = i1.toString();
                    System.out.println(s1);
                    String s2 = j1.toString();
                    System.out.println(s2);
                    str.add(k,new String(s1 + s2));
                    k++;
                }
            }
            System.out.println();
        }

        Random rand = new Random();

        int random = rand.nextInt((str.size() - 1 - 0) + 1) + 0;
        return str.get(random);
    }

    private String getChar(int a,int b) {
        return shiftIndex.get(a-10).get(b-10).toString();
    }

}
