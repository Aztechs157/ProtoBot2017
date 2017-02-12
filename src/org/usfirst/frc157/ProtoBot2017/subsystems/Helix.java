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
public class Helix extends Subsystem {

    private final CANTalon helixMotorRight = RobotMap.helixMotorRight;
    private final CANTalon helixMotorLeft = RobotMap.helixMotorLeft;
    private final double motorSpeed = 0.3;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.



        
    public Helix()
    {
        System.out.println("helix");
        
        helixMotorRight.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
        helixMotorLeft.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
        
        
    }        
   // Right Motor+
    
    public void loadRight()
    {
        System.out.println("going up right");
        
        helixMotorRight.set(motorSpeed);
    }
    public void loadLeft()
    {
        helixMotorLeft.set(-motorSpeed);
    }
    public void unloadRight()
    {
        helixMotorRight.set(-motorSpeed);
    }
    public void unloadLeft()
    {
        helixMotorLeft.set(motorSpeed);
    }
    public void idleRight()
    {
        helixMotorRight.set(0.0);        
    }
    public void idleLeft()
    {
        helixMotorRight.set(0.0);
    }
    
    
    @Override
    protected void initDefaultCommand()
    {
        // TODO Auto-generated method stub
        
    }
}
    