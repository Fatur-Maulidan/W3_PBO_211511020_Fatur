package soal6.pkg3;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal63 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        BigInteger var1 = new BigInteger("0");
        BigInteger var2 = new BigInteger("0");
        
        var1 = s.nextBigInteger();
        var2 = s.nextBigInteger();
        
        System.out.println(var1.add(var2));
        System.out.println(var1.multiply(var2));
    }
}
