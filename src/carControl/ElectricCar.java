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
    
    private boolean powered;
    private int direction;
    private int speed;
    
    ElectricCar(){
        speed = 0;
        direction = 360;
    }
    
    @Override
    public void powerOn(){
        powered = true;
        speed = 0;
    }
    
    @Override
    public void powerOff(){
        powered = false;
        speed = 0;
    }
    
    @Override
    public void turnRight(){
        direction = direction + 5; 
    }
    
    @Override
    public void turnLeft(){
        direction = direction - 5;        
    }
    
    @Override
    public void goFaster(){
        speed += 5;        
    }
    
    @Override
    public void slowDown(){
        speed -= 5;
    }
    
    @Override
    public String toString(){
        if (!powered){
            return "car is powered off";
        }
        
        else if (speed == 0){
            return "car is stopped";
        }        
        
        return "car travels in " + direction + " deg at the speed of " + speed + " mph";
        
    }
}
