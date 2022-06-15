/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresources;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Employee extends Staff {

    private double soGioLamThem;   

    public Employee() {
    }

    public Employee(double soGioLamThem, String loai, String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam, Department boPhan, int soNgayNghi) {
        super(loai, maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhan, soNgayNghi);
        this.soGioLamThem = soGioLamThem;
    }
    
    @Override
    public int calculateSalary(){
       return (int) (super.getHeSoLuong()* 3000000 + this.soGioLamThem*200000);
    }
    // Hiển thị thông tin nhân viên
    @Override
    public void displayInformation(){
        System.out.printf("Mã nhân viên: %s - Tên nhân viên: %s - Tuổi nhân viên: %s - Hệ số lương: %s "
                + "- Ngày vào làm: %s - Bộ phận: %s - Số ngày nghỉ: - %s - Số giờ làm thêm %s - Lương: %s",
                super.getMaNhanVien(), super.getTenNhanVien(), super.getTuoiNhanVien(), super.getHeSoLuong(), super.getNgayVaoLam(), super.getBoPhan().getTenBoPhan(), super.getSoNgayNghi(), soGioLamThem, calculateSalary());
    }
    // Hiển thị bảng lương nhân viên
    @Override
    public void displaySalary() {
        System.out.printf("Mã nhân viên: %s - Tên nhân viên: %s - Bộ phân: %s - Lương: %s",super.getMaNhanVien(), super.getTenNhanVien(), super.getBoPhan().getTenBoPhan(), calculateSalary());
    }
    
    public double getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(double soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }    

    
}
