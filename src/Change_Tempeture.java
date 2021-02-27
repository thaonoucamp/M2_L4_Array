import java.util.Scanner;

public class Change_Tempeture {
    // cong thuc chuyen doi nhiet do;
    // celsius = (5.0 / 9) * (fahrenheit -32);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fah;
        double cel;
        int choice;

        do {
            System.out.println("Menu :");
            System.out.println("1 - Fah to Cel :");
            System.out.println("2 - Cel to Fah :");
            System.out.println("0 - Exit :");

            System.out.println("Enter your choice :");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit:");
                    fah = Double.parseDouble(sc.nextLine());
                    System.out.println("Fah to Cel : " + fahToCel(fah));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    cel = Double.parseDouble(sc.nextLine());
                    System.out.println("Cel to Fah: " + celToFah(cel));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Nhin lai xem co may lua chon !");
                    break;
            }
        } while (choice != 0);
    }

    // cong thuc chuyen tu c sang f;
    public static double celToFah(double cel) {
        double fah = (9.0 / 5) * cel + 32;
        return fah;
    }

    // cong thuc chuyen tu F sang C;
    public static double fahToCel(double fah) {
        double cel = (5.0 / 9) * (fah - 32);
        return cel;
    }
}
