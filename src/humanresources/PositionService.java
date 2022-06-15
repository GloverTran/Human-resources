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
public class PositionService {

    public PositionService() {
        positions = initialize();
    }
    
    private ArrayList<Position> positions;

    public ArrayList<Position> getPosition() {
        return positions;
    } 
    // Các chức vụ đang có tại công ty
    private ArrayList<Position> initialize(){
        Position posi1 = new Position();
        posi1.setCompanyPosition("Business Leader");
        posi1.setWage(8000000);
        Position posi2 = new Position();
        posi2.setCompanyPosition("Project Leader");
        posi2.setWage(5000000);
        Position posi3 = new Position();
        posi3.setCompanyPosition("Technical Leader");
        posi3.setWage(6000000);
        ArrayList<Position> positionService = new ArrayList<>();
        positionService.add(posi1);
        positionService.add(posi2);
        positionService.add(posi3);
        return positionService;
    }
    
}
