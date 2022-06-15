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
public class Department {
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuong;

    public Department(String maBoPhan, String tenBoPhan, int soLuong) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuong = soLuong;
    }  

    public Department() {
    }
  
    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Bộ phận: " + "Mã bộ phận: " + maBoPhan + "- Tên bộ phận: " + tenBoPhan + "- Số lượng: " + soLuong;
    }
    
}
