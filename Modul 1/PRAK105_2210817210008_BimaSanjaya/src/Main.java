import java.util.Scanner;

public class Main {
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