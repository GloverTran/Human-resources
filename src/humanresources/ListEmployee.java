/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class ListEmployee {
    private ArrayList<Staff> list = new ArrayList<>();
    private ArrayList<Department> listDp;
    private ArrayList<Position> listPs;
    // Thêm nhân viên vào công ty
    public void createEmployee(Scanner sc){
        boolean will =true;
        do{
            System.out.println("Nhập loại nhân viên (1. Nhân viên thông thường, 2. Quản lý): ");
            int type = sc.nextInt();
            switch (type){
                // Tạo đối tượng nhân viên và truyền giá trị vào list
                case 1:
                    Employee employee = new Employee();
                    System.out.print("Mã nhân viên: ");
                    employee.setMaNhanVien(sc.next());
                    System.out.print("Tên nhân viên: ");
                    employee.setTenNhanVien(sc.next());
                    System.out.print("Tuổi nhân viên: ");
                    employee.setTuoiNhanVien(sc.nextInt());
                    System.out.print("Hệ số lương: ");
                    employee.setHeSoLuong(sc.nextInt());
                    System.out.print("Ngày vào làm: ");
                    employee.setNgayVaoLam(sc.next());
                    System.out.print("Bộ phận làm việc: " + listDep());
                    int numDepartment = sc.nextInt();
                    employee.setBoPhan(listDp.get(numDepartment-1));
                    System.out.println("Bộ phận làm việc: " + employee.getBoPhan().getTenBoPhan());
                    System.out.print("Số ngày nghỉ: ");
                    employee.setSoNgayNghi(sc.nextInt());
                    System.out.print("Số giời làm thêm: ");
                    employee.setSoGioLamThem(sc.nextDouble());
                    list.add(employee);
                    break;
                // Tạo đối tượng manager và truyền giá trị vào list
                case 2:
                    Manager manager = new Manager();
                    System.out.print("Mã nhân viên: ");
                    manager.setMaNhanVien(sc.next());
                    System.out.print("Tên nhân viên: ");
                    manager.setTenNhanVien(sc.next());
                    System.out.print("Tuổi nhân viên: ");
                    manager.setTuoiNhanVien(sc.nextInt());
                    System.out.print("Hệ số lương: ");
                    manager.setHeSoLuong(sc.nextInt());
                    System.out.print("Ngày vào làm: ");
                    manager.setNgayVaoLam(sc.next());
                    System.out.print("Bộ phận làm việc: " + listDep());
                    int numDepartment1 = sc.nextInt();
                    manager.setBoPhan(listDp.get(numDepartment1-1));
                    System.out.println("Bộ phận làm việc: " + manager.getBoPhan().getTenBoPhan());
                    System.out.print("Số ngày nghỉ: ");
                    manager.setSoNgayNghi(sc.nextInt());
                    System.out.print("Chức vụ: " + listPosition());
                    int numPosition = sc.nextInt();
                    manager.setChucVu(listPs.get(numPosition -1));
                    System.out.println("Chức vụ: " + manager.getChucVu().getCompanyPosition());
                    System.out.println("Lương trách nhiệm: " + manager.getChucVu().getWage());
                    list.add(manager);
                    break;
            }
            System.out.println("\n----------------------------");
            System.out.println("Nhấn số bất kỳ để tiếp tục\n"
                    + "Nhấn phím 1 để trở lại Menu chính");
            int num = sc.nextInt();
            if(num == 1){
                will = false;
            }
        }while(will);
    }
    // Hiển thị thông tin nhân viên
    public void displayInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách nhân viên: ");
        boolean will = true;
        do{
            // Duyệt qua mảng và in ra danh sách nhân viên
            for(Staff nv: list){
                nv.displayInformation();
                System.out.println("\n----------------------------");
            }
            System.out.println("Nhấn số bất kỳ để tiếp tục\n"
                    + "Nhấn phím 1 để trở lại Menu chính");
            int num = sc.nextInt();
            if(num == 1){
                will = false;
            }
        }while(will);
    }
    // Tìm kiếm thông tin nhân viên thông qua tên hoặc mã nhân viên
    public void search(){
        Scanner sc = new Scanner(System.in);
        boolean will = true;
        do{
            System.out.print("Tìm thông tin nhân viên theo tên hoặc theo mã: \n"
                    + "(1. Theo tên"
                    + " 2. Theo mã)");
            int num = sc.nextInt();
            
                System.out.println();
            // Tìm kiếm thông tin bằng tên
            if(num == 1){
                System.out.print("Nhập tên cần tìm: ");
                String name = sc.next();
                Staff tenFound = null;
                for(Staff ten: list){
                    if(ten.getTenNhanVien().equalsIgnoreCase(name)){
                        tenFound = ten;
                        break;
                    }
                }
                if(tenFound != null){
                    System.out.println("Thông tin nhân viên tìm thấy theo tên: ");
                    tenFound.displayInformation();
                }else {
                    System.out.println("Không tìm thấy thông tin nhân viên có tên: " + name);
                }
            // Tìm kiếm thông tin bằng mã nhân viên
            }else if(num == 2){
                System.out.print("Nhập mã nhân viên cần tìm: ");
                String ma = sc.next();
                Staff maFound = null;
                for(Staff maNV: list){
                    if(maNV.getMaNhanVien().equalsIgnoreCase(ma)){
                        maFound = maNV;
                        break;
                    }
                }
                if(maFound != null){
                    System.out.println("Thông tin nhân viên tìm thấy theo mã nhân viên: ");
                    maFound.displayInformation();
                }else{
                    System.out.println("Không tìm thấy thông tin nhân viên có mã nhân viên: " + ma);
                }
            }
            System.out.println("\n----------------------------");
            System.out.println("Nhấn số bất kỳ tiếp tục tìm kiếm thông tin nhân viên:\n"
                    + "(Nhấn phìm 1 để quay trở lại Menu chính)");
            int tieptuc = sc.nextInt(); 
            if(tieptuc == 1){
                will = false;
            }
        }while(will);
    }
    // sắp xếp lương theo thứ tự tăng dần
    public void sapXepTheoLuong(){
       Collections.sort(list, (Staff a,Staff b)-> (int)(a.calculateSalary() - b.calculateSalary()));
    }
    // Sắp xếp lương theo thứ tự giảm dần
    public void sapXepTheoTangDan(){
        Collections.sort(list, (Staff a, Staff b)-> (int)(b.calculateSalary() - a.calculateSalary()));
    }
    // Hiện bảng lương không theo thứ tự
    public void hienBangLuong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bảng lương của nhân viên trong công ty");
        boolean will = true;
        do{
            for(Staff nv: list){
                if(nv instanceof Employee){
                    ((Employee)nv).displaySalary();
                }else if(nv instanceof Manager){
                    ((Manager)nv).displaySalary();
                }
                System.out.println("\n----------------------------");
            }
            System.out.println("Nhấn số bất kỳ để tiếp tục\n"
                    + "Nhấn phím 1 để trở lại Menu chính");
            int num = sc.nextInt();
            if(num == 1){
                will = false;
            }
        }while(will);
    }
    
    // Hiển thị thông tin bộ phận hiện có tại công ty
    public void displayStaff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bảng lương của nhân viên trong công ty");
        boolean will = true;
        do{
            // Thống kê số lượng nhân viên của từng bộ phận
            for(int i =0; i< listDp.size(); i++){
                int count =0;
                for(int j =0; j< list.size(); j++){
                    if(list.get(j).getBoPhan().getTenBoPhan().equalsIgnoreCase(listDp.get(i).getTenBoPhan())){
                    count++;
                    }
                    listDp.get(i).setSoLuong(count);
                }
                System.out.println("Hiển thị thông tin bộ phận: ");
                System.out.println(listDp.get(i).toString());
            }
            System.out.println("Nhấn số bất kỳ để tiếp tục\n"
                    + "Nhấn phím 1 để trở lại Menu chính");
            int num = sc.nextInt();
            if(num == 1){
                will = false;
            }
        }while(will);
    }
    // Hiển thị nhân viên theo từng bộ phận
    public void staffDepartment(){
        for(int i = 0; i<listDp.size(); i++){
            System.out.println(listDp.get(i).getTenBoPhan() +":");
            for(int j = 0; j< list.size(); j++){
                if(list.get(j).getBoPhan().getTenBoPhan().equalsIgnoreCase(listDp.get(i).getTenBoPhan())){
                    System.out.print(j+ 1 + " ");
                    list.get(j).displayInformation();
                    System.out.println();
                }
            }
            System.out.println("\n-------------------");
        }
    }
    // Hiển thị các bộ phận đang có tại công ty
    private String listDep(){
        String listDep ="";
        for(int i =0; i < listDp.size(); i++)
        {
            listDep += i+1 + " " + listDp.get(i).getTenBoPhan()+" ";
        }
        return listDep;
    }    
    // Hiển thị các chức vụ đang có tại công ty
    public String listPosition(){
        String listPos = "";
        for(int i =0; i < listPs.size(); i++){
            listPos += i+1 + " " + listPs.get(i).getCompanyPosition()+": " + Integer.toString(listPs.get(i).getWage()) + " ";
        }
        return listPos;
    }
    
    public ArrayList<Department> getListDp() {
        return listDp;
    }
    
    public void setListDp(ArrayList<Department> listDp) {
        this.listDp = listDp;
    }
    
    public ArrayList<Position> getListPs() {
        return listPs;
    }
    
    public void setListPs(ArrayList<Position> listPs) {
        this.listPs = listPs;
    }
        
}
