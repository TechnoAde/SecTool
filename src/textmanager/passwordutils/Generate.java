package textmanager.passwordutils;

import java.util.Random;

public class Generate {

    protected final static char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!£$%&/()=?^é*§°çL_:;_-".toCharArray();
    protected final static char[] ints = "12345678910".toCharArray();

    public static char[] charsg(Random random, final int lunghezza) {

        final char[] chars1 = new char[lunghezza];

        for(int i = 0; i<lunghezza; i++) {chars1[i]= chars[random.nextInt(chars.length)];}

        return chars1;
    }

    public static char[] intg(Random random, final int lunghezza) {

        final int[] ints1 = new int[lunghezza];

        for(int i = 0; i<lunghezza; i++) {ints1[i]= ints[random.nextInt(ints.length)];}

        return ints;
    }

}
