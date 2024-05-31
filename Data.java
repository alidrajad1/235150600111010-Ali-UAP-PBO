import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai() {
        System.out.print("Masa tanam (bulan): ");
        int masaTanam = in.nextInt();
        int hariTanam = masaTanam * 30;

        menanam();
    }

    public static void menanam() {
        int pilih;
        do {
        System.out.println("Mau menanam apa?");
        System.out.println("1.Tomat \n2.Stroberi \n3.Persik");
        pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    tanamans.add(new Tomat());
                    System.out.println("Tomat berhasil ditanam!\n");
                    break;
                case 2:
                    tanamans.add(new Stroberi());
                    System.out.println("Stroberi berhasil ditanam!\n");
                    break;
                case 3:
                    tanamans.add(new Persik());
                    System.out.println("Persik berhasil ditanam!\n");
                    break;
                default:
                System.out.println("Gak ada!");
                    break;
            }
        } while (pilih != 4);
            in.close();

    }

    public static void info() {
        tanamans.get(0).toString();
        tanamans.get(1).toString();
        tanamans.get(2).toString();
        }
    }

