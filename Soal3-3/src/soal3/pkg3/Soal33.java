package soal3.pkg3;
import java.util.*;
public class Soal33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jmlh = 0;
        int x0=s.nextInt();
        String a = s.next();
        int x1 = s.nextInt();
        switch(a){
            case "+":
                jmlh = x0 + x1;
                break;
            
            case "-":
                jmlh = x0 - x1;
                break;
                
            case "/":
                jmlh = x0 / x1;
                break;
            
            case "*":
                jmlh = x0 * x1;
                break;
            
            default:
                System.out.println("Tidak ada operasi aritmatika tersebut");
                break;
        } 
        System.out.println(jmlh);
    }
}
