package classical.classes;

/**
 * Created by cooper on 03.04.15.
 */


public class Alphabet {

    public String getEnglishCh() {
        char[] alphabet = new char[26+26];
        int i = 0;
        for (char ch = 65; ch <= 90; ch++) {
            alphabet[i] = ch;
            i++;
        }
        for (char ch = 97; ch <=122; ch++) {
            alphabet[i] = ch;
            i++;
        }

        return new String(alphabet);
    }

    public String getRussianCh() {
        char[] alphabet = new char[32+32];
        int i = 0;
        for (char ch = 1040; ch <= 1103; ch++) {
            alphabet[i] = ch;
            i++;
        }

        return new String(alphabet);
    }

    public String getDigitCh() {
        char[] alphabet = new char[10];
        int i = 0;
        for (char ch = 48; ch <= 57 ; ch++) {
            alphabet[i] = ch;
            i++;
        }

        return new String(alphabet);
    }

    public String  getSpecialCh() {
        char[] alphabet = new char[48+7+6+69];
        int i = 0;
        for (char ch = 0; ch <= 47; ch++) {
            alphabet[i] = ch;
            i++;
        }
        for (char ch = 58; ch <= 64; ch++) {
            alphabet[i] = ch;
            i++;
        }
        for (char ch = 91; ch <= 96; ch++) {
            alphabet[i] = ch;
            i++;
        }
        for (char ch = 123; ch <= 191; ch++) {
            alphabet[i] = ch;
            i++;
        }

        return new String(alphabet);
    }


    public String getSpecialCh1() {
        char[] alphabet = {10,13,173,160,32,9,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,58,59,60,61,62,63};
        return new String(alphabet);
    }
}
