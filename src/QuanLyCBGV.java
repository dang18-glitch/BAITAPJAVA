import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCBGV {
    ArrayList<CBGV> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void them() {
        System.out.print("Mã GV: ");
        String ma = sc.nextLine();

        System.out.print("Họ tên: ");
        String ten = sc.nextLine();

        System.out.print("Tuổi: ");
        int tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Quê quán: ");
        String que = sc.nextLine();

        System.out.print("Lương cứng: ");
        double lc = Double.parseDouble(sc.nextLine());

        System.out.print("Lương thưởng: ");
        double lt = Double.parseDouble(sc.nextLine());

        System.out.print("Tiền phạt: ");
        double tp = Double.parseDouble(sc.nextLine());

        ds.add(new CBGV(ten, tuoi, que, ma, lc, lt, tp));
    }

    public void xoa() {
        System.out.print("Nhập mã GV cần xóa: ");
        String ma = sc.nextLine();

        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaGV().equals(ma)) {
                ds.remove(i);
                System.out.println("Đã xóa!");
                return;
            }
        }
        System.out.println("Không tìm thấy.");
    }

    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        for (CBGV gv : ds) {
            gv.hienThi();
        }
    }
}