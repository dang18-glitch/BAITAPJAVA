public class CBGV extends Nguoi {
    private double luongCung;
    private double luongThuong;
    private double tienPhat;

    public CBGV(String hoTen, int tuoi, String queQuan, String maGV,
                double luongCung, double luongThuong, double tienPhat) {
        super(hoTen, tuoi, queQuan, maGV);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public double tinhLuongThucLinh() {
        return luongCung + luongThuong - tienPhat;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Lương cứng: " + luongCung);
        System.out.println("Lương thưởng: " + luongThuong);
        System.out.println("Tiền phạt: " + tienPhat);
        System.out.println("Lương thực lĩnh: " + tinhLuongThucLinh());
        System.out.println("-------------------------");
    }
}