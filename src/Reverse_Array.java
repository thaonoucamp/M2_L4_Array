import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        // khai bao cac bien va nhap vao kich thuoc mang;
        int size;
        int[] array;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a size : ");
            size = Integer.parseInt(sc.nextLine());

            if (size > 10) {
                System.out.println("Size does not exceed 10 !");
            }
        } while (size > 10);

        // nhap gia tri cho cac phan tu cua mang;

        array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        // in ra mang da nhap;
        System.out.printf("%-10s%s", "Element in array : ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        // dao nguoc cac phan tu trong mang;
        // su dung bien trung gian de hoan doi vi tri;
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        // in ra mang da dao nguoc;
        System.out.printf("%-10s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
