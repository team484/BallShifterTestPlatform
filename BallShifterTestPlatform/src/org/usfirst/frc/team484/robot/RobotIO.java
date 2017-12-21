package org.usfirst.frc.team484.robot;

import java.util.ArrayList;
import java.util.List;

import org.team484.api.motion.ShifterDrive;
import org.team484.api.motion.ShifterSolenoid;
import org.team484.api.motion.SpeedControllerGroup;
import org.team484.api.sensor.ShifterEncoder;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Handles instantiation and storing of all robot objects.
 */
public class RobotIO {
	public static SpeedControllerGroup leftMotors;
	public static SpeedControllerGroup rightMotors;
	
	public static ShifterSolenoid shifterSolenoid;

	
	public static ShifterEncoder leftEncoder;
	public static ShifterEncoder rightEncoder;
	
	public static ShifterDrive drive;
	
	public static Joystick driveJoystick;
	
	/**
	 * Instantiates all robot objects and applies settings as defined in RobotSettings.
	 */
	public RobotIO() {
		
		//-----------Instantiate Objects----------
		List<CANTalon> leftTalons = new ArrayList<>();
		List<CANTalon> rightTalons = new ArrayList<>();
		for (int i : RobotMap.LEFT_DRIVE_MOTOR_IDS) {
			leftTalons.add(new CANTalon(i));
		}
		for (int i : RobotMap.RIGHT_DRIVE_MOTOR_IDS) {
			rightTalons.add(new CANTalon(i));
		}
		leftMotors = new SpeedControllerGroup((CANTalon[])leftTalons.toArray());
		rightMotors = new SpeedControllerGroup((CANTalon[])rightTalons.toArray());
		
		shifterSolenoid = new ShifterSolenoid(RobotMap.SHIFTER_SOLENOID_LOW_GEAR_PORT, RobotMap.SHIFTER_SOLENOID_HIGH_GEAR_PORT);
		
		leftEncoder = new ShifterEncoder(RobotMap.LEFT_ENCODER_A_CHANNEL, RobotMap.LEFT_ENCODER_B_CHANNEL,
				shifterSolenoid);
		rightEncoder = new ShifterEncoder(RobotMap.RIGHT_ENCODER_A_CHANNEL, RobotMap.RIGHT_ENCODER_B_CHANNEL,
				shifterSolenoid);
		
		drive = new ShifterDrive(leftMotors, rightMotors, leftEncoder, rightEncoder);
				
		driveJoystick = new Joystick(RobotMap.DRIVE_STICK_PORT);
		
		//-----------Apply Settings-----------
		leftEncoder.setDistancePerPulse(RobotSettings.LEFT_ENCODER_DISTANCE_PER_PULSE);
		rightEncoder.setDistancePerPulse(RobotSettings.RIGHT_ENCODER_DISTANCE_PER_PULSE);
		leftEncoder.setLowGearRPP(RobotSettings.LOW_GEAR_ROTATIONS_PER_ENCODER_PULSE);
		rightEncoder.setLowGearRPP(RobotSettings.LOW_GEAR_ROTATIONS_PER_ENCODER_PULSE);
		leftEncoder.setLowGearRPP(RobotSettings.HIGH_GEAR_ROTATIONS_PER_ENCODER_PULSE);
		rightEncoder.setLowGearRPP(RobotSettings.HIGH_GEAR_ROTATIONS_PER_ENCODER_PULSE);
		
		leftMotors.setInverted(RobotSettings.INVERT_LEFT_MOTORS);
		rightMotors.setInverted(RobotSettings.INVERT_LEFT_MOTORS);
		
		drive.setDownshiftRPM(RobotSettings.DOWNSHIFT_RPM);
		drive.setUpshiftRPM(RobotSettings.UPSHIFT_RPM);
	}
}
