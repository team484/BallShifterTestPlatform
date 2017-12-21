package org.usfirst.frc.team484.robot.commands;

import org.usfirst.frc.team484.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Toggles the drivetrain between Auto, Low gear, and High gear modes. This command instantly terminates.
 */
public class ToggleShifterMode extends Command {

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrainSubsystem.toggleShiftingMode();
    }

    protected boolean isFinished() { return true; }

}
