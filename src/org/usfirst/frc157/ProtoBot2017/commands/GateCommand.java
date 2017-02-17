// RobotBuilder Version: 2.0 
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.ProtoBot2017.commands;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc157.ProtoBot2017.Robot;
import org.usfirst.frc157.ProtoBot2017.subsystems.Collect;
import org.usfirst.frc157.ProtoBot2017.subsystems.Gate;
import org.usfirst.frc157.ProtoBot2017.subsystems.Shoot;

/**
 *
 */
public class GateCommand extends Command {
    
    private Gate.gateCommand gateCommand; 

    private boolean finished = false;
    
    public GateCommand(Gate.gateCommand command) {
        gateCommand = command;
        requires(Robot.gate);
        
    }
     
    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("Gate: initialize()");
        finished = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        System.out.println("Gate: execute()" + gateCommand);
        if (gateCommand == Gate.gateCommand.OPEN);
        {
            Robot.gate.open();
            finished=false ;
        }
        if (gateCommand == Gate.gateCommand.CLOSED)
        {
            Robot.gate.close();
            finished=false; 
        }
        else if(gateCommand == Gate.gateCommand.OFF)
        {
            Robot.gate.off();
            finished=true; 
        }
        else
        {  
            finished=true;
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        System.out.println("Gate: isfinished()"+finished);
        return  finished;
    }

    // Called once after isFinished returns true
    protected void end() {
        System.out.println("Gate: end()");
        Robot.collect.idle();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.println("Gate: interrupted()");
        Robot.collect.idle();
    }
}

