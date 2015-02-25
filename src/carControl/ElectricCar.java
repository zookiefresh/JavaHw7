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
    private int angle;
    private int speed;
    
    final static private int maxSpeed = 100;
    final static private int minSpeed = 0;
    final static private int speedStep = 2;
    
    final static private int minAngle = 0;
    final static private int maxAngle = 360;
    final static private int angleStep = 5;
    
    ElectricCar(){
        speed = minSpeed;
        angle = minAngle;
        powered = false;
    }
    
    @Override
    public void powerOn(){
        powered = true;
        speed = minSpeed;
    }
    
    @Override
    public void powerOff(){
        powered = false;
        speed = minSpeed;
    }
    
    @Override
    public void turnRight(){
        if(powered){
            angle = angle + angleStep;           
            angle = angle % maxAngle;        
        }
        
    }
    
    @Override
    public void turnLeft(){
        if(powered){
            angle = angle - angleStep;            
            angle = ((angle + maxAngle) % maxAngle);
            if (angle < minAngle){
                angle = angle + maxAngle;        
            }
        }
    }
    
    @Override
    public void goFaster(){
        if(powered){            
            speed += speedStep;        
            if (speed > maxSpeed){
                speed = maxSpeed;
            }
        }
    }
    
    @Override
    public void slowDown(){
        if(powered){
            speed -= speedStep;
            if(speed < minSpeed){
                speed = minSpeed;
            }
        }
    }
    
    @Override
    public String toString(){
        if (!powered){
            return "car is powered off";
        }
        
        else if (speed == 0){
            return "car is stopped";
        }        
        
        return "car travels in " + angle + " deg at the speed of " 
                + speed + " mph";
        
    }
}
