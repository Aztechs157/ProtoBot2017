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
import org.usfirst.frc157.ProtoBot2017.commands.*;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DigitalInput;


/**
 *
 */
public class Gear extends Subsystem {

    private final double OPEN_SPEED  = 0.4;
    private final double CLOSE_SPEED = 0.2;
    private final CANTalon gearMotor = RobotMap.gearMotor;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    // Limit Switches
    protected DigitalInput openLimitSwitch;
    protected DigitalInput closeLimitSwitch;

    public enum GearCommand
    {
        OPEN,
        CLOSE,
        IDLE
    }
        
    public Gear()
    {
        System.out.println("Gear: Gear()");
        openLimitSwitch = new DigitalInput(6);
        closeLimitSwitch = new DigitalInput(7); 
        
        gearMotor.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
    }        
   
    
    public boolean isClosed()
    {
        //int test = 1 / 0;
        boolean test;
        System.out.println("Gear: isClosed()");
        test = closeLimitSwitch.get();
        if (test == false)
        {
            System.out.println("is closed: false");
        }
        else
        {
            System.out.println("is closed: true");
        }
        return test;
    }

    public boolean isOpen()
    {
        return openLimitSwitch.get();
    }
    
    public void close()
    {
        gearMotor.set(-CLOSE_SPEED);
    }

    public void open()
    {
        gearMotor.set(OPEN_SPEED);
        
    }

    public void idle()
    {
        gearMotor.set(0.0);        
    }

    
    @Override
    protected void initDefaultCommand()
    {
        // TODO Auto-generated method stub
        
    }
}
    
