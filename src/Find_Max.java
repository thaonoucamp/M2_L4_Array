import java.util.Scanner;

public class Find_Max {
    public static void main(String[] args) {


        // khai bao cac bien nhap, kiem tra kich thuoc mang;

        int size;
        int[] array;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size :");
            size = Integer.parseInt(sc.nextLine());

            if (size > 10) {
                System.out.println("Size should not exceed 10 !");
            }
        } while (size > 10);

        // nhap gia tri cho cac phan tu;
        array = new int[size];
        int i = 0;

        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        // in ra danh sach da nhap;
        System.out.print("list : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // duyet cac phan tu trong mang de tim GTLN va vi tri;
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest value is : " + max + " at position " + index);
    }
}
