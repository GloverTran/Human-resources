/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresources;

import java.util.Scanner;

/**
 * Ngày viết 23/4/2022
 * @author Admin
 */

public class HumanResources {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListDepartment depart = new ListDepartment();
        PositionService positionSer = new PositionService();
        ListEmployee list = new ListEmployee();
        list.setListDp(depart.getDepartments());
        list.setListPs(positionSer.getPosition());
        Scanner console = new Scanner(System.in);
        boolean run = true;
        
        while(run){
            begin();
            int choice = console.nextInt();
            switch(choice){
                //Hiển thị thông tin nhân viên
                case 1: 
                    list.displayInformation();
                    break;
                // Hiển thị các bộ phận tại công ty
                case 2: 
                    list.displayStaff();
                    break;
                // Hiển thị nhân viên theo bộ phận
                case 3:
                    list.staffDepartment();
                    break;
                // Thêm nhân viên
                case 4:
                    list.createEmployee(console);
                    break; 
                // Tìm kiếm thông tin nhân viên bằng mã nhân viên hoặc tên
                case 5:
                    list.search();
                    break;
                // Hiện bảng lương nhân viên 
                case 6:    
                    list.hienBangLuong();
                    break;
                // Sắp xếp lương theo thứ tự tăng dần
                case 7:
                    list.sapXepTheoLuong();
                    list.hienBangLuong();
                    break;
                // Sắp xếp lương theo thứ tự giảm dần
                case 8: 
                    list.sapXepTheoTangDan();
                    list.hienBangLuong();
                    break;
                // Thoát ra khỏi chương trình
                case 9:
                    run = false;
                    break;
                        
            }
        }
    }
    // Các chức năng được sử dụng
    public static void begin(){
    System.out.println("Vui lòng lựa chọn chức năng: ");
            System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty.\n"
            + "2. Hiển thị các bộ phận trong công ty\n"
            + "3. Hiển thị các nhân viên theo từng bộ phận.\n"
            + "4. Thêm nhân viên mới vào công ty.\n"
            + "5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.\n"
            + "6. Hiển thị bảng lương của nhân viên toàn công ty.\n"
            + "7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.\n"
            + "8. Sắp xếp lương theo thứ tự giảm dần.\n"
            + "9. Thoát khỏi chương trình."
            + "Lựa chọn của bạn (1-9).");
    }  
}

