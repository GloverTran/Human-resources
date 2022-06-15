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

public abstract class Staff implements ICalculator{
    private String maNhanVien;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private double heSoLuong;
    private String ngayVaoLam;
    private Department boPhan;
    private int soNgayNghi;
    private String loai;
    
    public Staff(String loai, String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam, Department boPhan, int soNgayNghi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
        this.soNgayNghi = soNgayNghi;
        this.loai = loai;
    }

    public Staff() {
    }
    
    abstract void displayInformation();
      
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    
    public void setBoPhan(Department boPhan){
        this.boPhan = boPhan;
    }

    public Department getBoPhan() {
        return boPhan;
    }
    
    public void setSoNgayNghi(int soNgayNghi){
        this.soNgayNghi = soNgayNghi;
    }
    
    public int getSoNgayNghi() {
        return soNgayNghi;
    }
    
    public void setHeSoLuong(int heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }   
}
