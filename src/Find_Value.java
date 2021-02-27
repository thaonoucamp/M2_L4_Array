import java.util.Scanner;

public class Find_Value {
    public static void main(String[] args) {
        // khai bao 1 mang danh sach sinh vien;
        String[] students = {"a", "b", "c", "d"};

        // khai bao bien luu gia tri tim kiem va gan gia tri nhap vao;
        Scanner sc = new Scanner(System.in);

        do {


            System.out.println("ENTER THE NAME YOU WANT TO FIND: ");
            String nameFind = sc.nextLine();

            // duyet mang sv da khai bao tim phan tu co gia tri bang ten can tim;
            boolean check = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(nameFind)) {
                    System.out.println("Position of the student " + nameFind + " in array is " + (i + 1));
                    check = true;
                    break;
                }
                if (check = false) {
                    System.out.println("Not found" + nameFind + " in the array !");
                }
            }
            System.out.println();
        } while (true);
    }
}
