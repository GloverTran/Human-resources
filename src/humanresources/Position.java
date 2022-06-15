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
public class Position {
    private String companyPosition;
    private int wage;

    public Position(String companyPosition, int wage) {
        this.companyPosition = companyPosition;
        this.wage = wage;
    }

    public Position() {
    } 

    public String getCompanyPosition() {
        return companyPosition;
    }

    public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
    
          
}
