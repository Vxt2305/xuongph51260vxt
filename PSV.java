package xuong;

import java.util.Scanner;

public class PSV extends PhongTro {

    private double TienMayGiat;
    private double TienDayPhoi;
    private double tienTroCoDinh;
    Scanner sc = new Scanner(System.in);

    public double getTienMayGiat() {
        return TienMayGiat;
    }

    public double getTienDayPhoi() {
        return TienDayPhoi;
    }

    public double getTienTroCoDinh() {
        return tienTroCoDinh;
    }

    public void setTienMayGiat(double tienMayGiat) {
        TienMayGiat = tienMayGiat;
    }

    public void setTienDayPhoi(double tienDayPhoi) {
        TienDayPhoi = tienDayPhoi;
    }

    public void setTienTroCoDinh(double tienTroCoDinh) {
        this.tienTroCoDinh = tienTroCoDinh;
    }

    public PSV(int soPhong, String tenChuPhong, double soDienDaDung, double soNuocDaDung, double tienWifi, double tienChiPhiPhong, double tienMayGiat, double tienDayPhoi, double tienTroCoDinh) {
        super(soPhong, tenChuPhong, soDienDaDung, soNuocDaDung, tienWifi, tienChiPhiPhong);
        TienMayGiat = tienMayGiat;
        TienDayPhoi = tienDayPhoi;
        this.tienTroCoDinh = tienTroCoDinh;
    }

    public PSV() {
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Moi nhap so tien may giat: ");
        while (!sc.hasNextDouble() && TienMayGiat <= 0) {
            System.out.print("Moi nhap so tien may giat la mot so thuc:  ");
            sc.next();
        }
        TienMayGiat = sc.nextDouble();
        System.out.print("Moi nhap so tien day phoi: ");
        while (!sc.hasNextDouble() && TienDayPhoi <= 0) {
            System.out.print("Moi nhap so tien day phoi la mot so thuc:  ");
            sc.next();
        }
        TienDayPhoi = sc.nextDouble();
        System.out.print("Moi nhap so tien tro co dinh: ");
        while (!sc.hasNextDouble() && tienTroCoDinh <= 0) {
            System.out.print("Moi nhap so tien tro la mot so thuc:  ");
            sc.next();
        }
        tienTroCoDinh = sc.nextDouble();
    }

    @Override
    public double getTienChiPhiPhong() {
        return getSoDienDaDung() + getSoNuocDaDung() + getTienWifi() + getTienDayPhoi() + getTienMayGiat();
    }

    @Override
    public double tinhTienTro() {
        return getTienChiPhiPhong() + getTienTroCoDinh();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Tien may giat: " + getTienMayGiat());
        System.out.println("Tien day phoi: " + getTienDayPhoi());
        System.out.println("Tong chi phi phong: " + getTienChiPhiPhong());
        System.out.println("Tien tro co dinh: " + getTienTroCoDinh());
        System.out.println("Tong tien phai dong: " + tinhTienTro());
        System.out.println("");
    }
}
