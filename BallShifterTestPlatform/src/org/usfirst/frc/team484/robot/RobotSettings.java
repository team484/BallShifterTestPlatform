package org.usfirst.frc.team484.robot;

/**
 * Stores all the magic numbers that should be kept out of code. MAGINC NUMBERS ARE BAD (so is caps lock).
 * This class should include various settings used by the robot such as encoder settings and buttons.
 * (Basically anything that isn't a physical port on the robot)
 */
public class RobotSettings {
	public static final double LEFT_ENCODER_DISTANCE_PER_PULSE = -0.111264646;
	public static final double RIGHT_ENCODER_DISTANCE_PER_PULSE = 0.111264646;
	public static final double LOW_GEAR_ROTATIONS_PER_ENCODER_PULSE = 10.42/256.0/3.0;
	public static final double HIGH_GEAR_ROTATIONS_PER_ENCODER_PULSE = 2.83/256.0/3.0;
	
	public static final boolean INVERT_LEFT_MOTORS = true;
	public static final boolean INVERT_RIGHT_MOTORS = false;
	
	public static final double DOWNSHIFT_RPM = 910;
	public static final double UPSHIFT_RPM = 3349;
	
	//-----Joystick button map-----
	public static final int SHIFTER_MODE_SWITCH_BUTTON = 1;
}
