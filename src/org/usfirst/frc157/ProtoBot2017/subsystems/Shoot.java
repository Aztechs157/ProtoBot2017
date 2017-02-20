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
public class Shoot extends Subsystem {

    private final CANTalon shootMotor = RobotMap.shootMotor;
    private final double HIGH_SHOT_POWER = 1.0;
    private final double LOW_SHOT_POWER = 0.8;
//    private double shootSpeed = -0.5;
    

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public enum ShootCommand
    {
        STOP,
        NEAR_POWER,
        FAR_POWER  
    }
    public Shoot()
    {
        System.out.println("Shoot: Shoot()");
        
        shootMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
    }        

//    public void setShootSpeed()
//    {
//        shootMotor.set(shootSpeed);
//    }
 
    public void idle()
    {
        shootMotor.set(0.0);        
    }
    public void near()
    {
        shootMotor.set(-LOW_SHOT_POWER);
    }
    public void far()
    {
        shootMotor.set(-HIGH_SHOT_POWER);
    }
    
    @Override
    protected void initDefaultCommand()
    {
        // TODO Auto-generated method stub
        
    }
}
    
