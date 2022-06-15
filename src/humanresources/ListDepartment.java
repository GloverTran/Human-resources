/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresources;

import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class ListDepartment {
    
    public ListDepartment() {
        departments = initialize();
    }
    
    private ArrayList<Department> departments;

    public ArrayList<Department> getDepartments() {
        return departments;
    }  
    // Các bộ phận đang có tại công ty
    private ArrayList<Department> initialize(){
        Department department1 = new Department();
        System.out.println("Bộ phận tại công ty");
        department1.setMaBoPhan("P-TC");
        department1.setTenBoPhan("Phòng tài chính");
        Department department2 = new Department();
        department2.setMaBoPhan("P-NS");
        department2.setTenBoPhan("Phòng nhân sự");
        Department department3 = new Department();
        department3.setMaBoPhan("P-SX");
        department3.setTenBoPhan("Phòng sản xuất");
        ArrayList<Department> departments = new ArrayList<>(); 
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);
        return departments;
    } 

    @Override
    public String toString() {
        return "ListDepartment{" + "departments=" + departments + '}';
    }
    
}
