package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> daduList= new LinkedList<>();

        int jumlahDadu = input.nextInt();
        for (int i = 0; i<jumlahDadu; i++){
            Dadu Dadu = new Dadu();
            Dadu.acakNilai();
            daduList.add(Dadu);
        }

        int totalNilai = 0;
        for (int i=0; i < daduList.size(); i++){
            Dadu Dadu = daduList.get(i);
            int nilai = Dadu.getNilai();
            System.out.println("Dadu ke-" + (i+1) + " bernilai " + nilai);
            totalNilai += nilai;
        }
        System.out.println("Total nilai dadu keseluruhan "+ totalNilai);
    }
}