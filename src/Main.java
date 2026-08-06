import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuanLyCBGV ql = new QuanLyCBGV();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Xóa cán bộ");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ql.them();
                    break;

                case 2:
                    ql.xoa();
                    break;

                case 3:
                    ql.hienThi();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}