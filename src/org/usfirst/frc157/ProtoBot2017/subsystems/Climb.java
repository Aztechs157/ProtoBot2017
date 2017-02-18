// RobotBuilder Version: 2.0 
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.ProtoBot2017.subsystems;

import org.usfirst.frc157.ProtoBot2017.RobotMap; 
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;


/**
 *
 */ 
public class Climb extends Subsystem {
    
    private final double TEST_MOD = -1; // set to 1 for all positive, -1 for all negative
 
    private final CANTalon climbMotor = RobotMap.climbMotor;
    private double climbSpeed = 0.8 * TEST_MOD;
    

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public enum ClimbCommand
    {
        IDLE,
        TEST,
        MATCH  
    }
    public Climb()
    {
        System.out.println("Climb: Climb()");
        
        climbMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
    }        

    public void setClimbSpeed()
    {
        climbMotor.set(climbSpeed);
    }
 
    public void idle()
    {
        climbMotor.set(0.0);        
    }
    public void test()
    {
        climbMotor.set(0.5 * TEST_MOD);
    }
    public void match()
    {
        climbMotor.set(0.8 * TEST_MOD);
    }
    
    @Override
    protected void initDefaultCommand()
    {
        // TODO Auto-generated method stub
        
    }
}
    
