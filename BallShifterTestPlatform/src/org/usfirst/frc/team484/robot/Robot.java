
package org.usfirst.frc.team484.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team484.robot.subsystems.Drivetrain;

public class Robot extends IterativeRobot {

	public static final Drivetrain drivetrainSubsystem = new Drivetrain();
	public static RobotIO robotIO;
	public static OI oi;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();

	@Override
	public void robotInit() {
		robotIO = new RobotIO();
		oi = new OI();
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		logRobotState();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		logRobotState();
	}


	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		logRobotState();
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
	
	/**
	 * Logs robot state information to the smart dashboard. This should be called periodically at all times.
	 */
	private static void logRobotState() {
		SmartDashboard.putBoolean("Is Low Gear", RobotIO.shifterSolenoid.isLowGear());
		SmartDashboard.putNumber("Left Motor RPM", RobotIO.leftEncoder.getRPM());
		SmartDashboard.putNumber("Right Motor RPM", RobotIO.rightEncoder.getRPM());
		double speed = Math.max(Math.abs(RobotIO.leftEncoder.getRate()), Math.abs(RobotIO.rightEncoder.getRate()));
		SmartDashboard.putNumber("Speed IPS", speed); //Inches per Second
		SmartDashboard.putNumber("Speed FPS", speed / 12.0); //Feet per Second
		SmartDashboard.putNumber("Speed MPH", speed / 17.6); //Miles per Hour
		SmartDashboard.putNumber("Left Encoder Distance", RobotIO.leftEncoder.getDistance());
		SmartDashboard.putNumber("Right Encoder Distance", RobotIO.rightEncoder.getDistance());
	}
}
