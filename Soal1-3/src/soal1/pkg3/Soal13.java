package soal1.pkg3;
import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String mystring = s.nextLine();
        String[] arr = mystring.split("[^a-zA-Z]+");
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i += 1)
        {
             System.out.println(arr[i]);
        }
    }
}
