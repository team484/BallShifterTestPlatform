package org.usfirst.frc.team484.robot.commands;

import org.usfirst.frc.team484.robot.Robot;
import org.usfirst.frc.team484.robot.RobotIO;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives the robot using input from the driver joystick.
 */
public class DriveTrainDriveWithJoystick extends Command {

    public DriveTrainDriveWithJoystick() {
    	requires(Robot.drivetrainSubsystem);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrainSubsystem.driveSquaredInputs(-RobotIO.driveJoystick.getY(), RobotIO.driveJoystick.getX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() { return false; }

    // Called once after isFinished returns true or when command is interrupted
    protected void end() {
    	Robot.drivetrainSubsystem.doNothing();
    }
}
