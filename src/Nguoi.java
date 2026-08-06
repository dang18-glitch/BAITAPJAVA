public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected String queQuan;
    protected String maGV;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String queQuan, String maGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maGV = maGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void hienThi() {
        System.out.println("Mã GV: " + maGV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê quán: " + queQuan);
    }
}