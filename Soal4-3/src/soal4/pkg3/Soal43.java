package soal4.pkg3;
import java.util.*;
public class Soal43 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float total_gaji, item = 50000, gaji = 500000;
        System.out.print("Anda berhasil menjual berapa item : ");
        float jual = s.nextFloat();
        if (jual > 80){
            total_gaji = (float) (gaji + ((item*jual)*0.35));
        } else if(jual >= 40 ){
            total_gaji = (float) (gaji + ((item*jual)*0.25));
        } else if (jual < 40 && jual > 15){
            total_gaji = (float) (gaji + (jual*item)*0.1);
        } else {
            total_gaji = (float) (gaji - (15 - jual)*(0.15*50000));
        }
        System.out.println(total_gaji);
        }
    }

