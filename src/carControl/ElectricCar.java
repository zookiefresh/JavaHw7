/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carControl;

/**
 *
 * @author duy
 */
public class ElectricCar implements CarControl {    
    
    private String powered;
    private int direction;
    private int speed;
    
    ElectricCar(){
        speed = 0;
        direction = 365;
    }
    
    public void powerOn(){
        powered = "On";
    }
    public void powerOff(){
        powered = "Off";
    }
    
    public void turnRight(){
        direction = direction - 5; 
    }
    
    public void turnLeft(){
        direction = direction + 5;        
    }
    
    public void goFaster(){
        speed += 5;        
    }
    
    public void slowDown(){
        speed -= 5;
    }
}
