import java.util.Scanner;

public class PRAK105_2210817210008_BimaSanjaya {
    public static void main(String[] args) {
        String makanan, hobi;

        Scanner typing = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit: ");
        makanan = typing.nextLine();
        System.out.print("Masukan Hobi: ");
        hobi = typing.nextLine();

        System.out.println("\nAku Suka Makan "+makanan+", dan Hobiku "+hobi);
    }
}