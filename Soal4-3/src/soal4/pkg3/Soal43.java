package soal4.pkg3;
import java.util.*;
public class Soal43 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float total_gaji, item = 50000, gaji = 500000;
        System.out.println("Anda berhasil menjual berapa item : ");
        float jual = s.nextFloat();
        if(jual >= 40 ){
            total_gaji = (float) (gaji + (item*jual*0.25)); 
        } else if (jual >= 80){
            total_gaji = (float) (gaji + (item*jual*0.35));
        } else if (jual < 15){
            total_gaji = (float) (gaji + 0.1*((15-jual)*item));
        } else {
            total_gaji = (float) (gaji + (0.10*(jual*item)));
        }
        System.out.println(total_gaji);
    }
    
}
