package org.usfirst.frc.team484.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int[] LEFT_DRIVE_MOTOR_IDS = {4,5,6};
	public static final int[] RIGHT_DRIVE_MOTOR_IDS = {1,2,3};
	
	public static final int LEFT_ENCODER_A_CHANNEL = 0;
	public static final int LEFT_ENCODER_B_CHANNEL = 1;
	public static final int RIGHT_ENCODER_A_CHANNEL = 2;
	public static final int RIGHT_ENCODER_B_CHANNEL = 3;
	
	public static final int SHIFTER_SOLENOID_LOW_GEAR_PORT = 0;
	public static final int SHIFTER_SOLENOID_HIGH_GEAR_PORT = 1;
	
	public static final int DRIVE_STICK_PORT = 0;
}
