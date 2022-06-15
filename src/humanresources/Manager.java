/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresources;


/**
 *
 * @author Admin
 */
public class Manager extends Staff{
    private Position chucVu;
    private int luongTrachNhiem;

    public Manager() {
    }

    public Manager(int luongTrachNhiem, String loai, String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam, Department boPhan, int soNgayNghi, Position chucVu) {
        super(loai, maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhan, soNgayNghi);
        this.chucVu = chucVu;
        this.luongTrachNhiem = luongTrachNhiem;
    }
    // Tính lương của quản lý       
    @Override
    public int calculateSalary(){
        return (int)(super.getHeSoLuong()*5000000 + chucVu.getWage());
    }
    // Hiển thị thông tin quản lý          
    @Override
    public void displayInformation(){
    System.out.printf("Mã nhân viên: %s - Tên nhân viên: %s - Tuổi nhân viên: %s - Hệ số lương: %s - Ngày vào làm: %s - "
        + "Bộ phận: %s - Số ngày nghỉ: %s - Chức vụ: %s - Lương trách nhiệm: %s - Lương: %s",
        super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(), super.getNgayVaoLam(), super.getBoPhan().getTenBoPhan(), super.getSoNgayNghi(), chucVu.getCompanyPosition(), chucVu.getWage(), calculateSalary());
    }
    // Hiển thị thông tin bảng lương    
    @Override
    public void displaySalary(){
        System.out.printf("Mã nhân viên: %s - Tên nhân viên: %s - Bộ phận: - %s Chức vụ: %s - Lương: %s", super.getMaNhanVien(), super.getTenNhanVien(), super.getBoPhan().getTenBoPhan(), chucVu.getCompanyPosition(), calculateSalary());
    }
        
    public int getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(int luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public Position getChucVu() {
        return chucVu;
    }

    public void setChucVu(Position chucVu) {
        this.chucVu = chucVu;
    }

    
 }     
