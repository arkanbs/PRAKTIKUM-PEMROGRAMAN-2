import java.util.Scanner;
public class PRAK102_2210817210008_BimaSanjaya {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" ");
        int angka = input.nextInt();
        int deret = 1;
        while (deret <= 11) {
            int hasil = angka;
            if (angka % 5 == 0) {
                hasil = angka / 5 - 1;
            }
            System.out.print( " " + hasil);
            angka++;
            deret++;
        }
        input.close();
    }
}