package org.usfirst.frc.team484.robot;

import org.usfirst.frc.team484.robot.commands.ToggleShifterMode;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is used to define joystick buttons and the actions the robot should take when any button is
 * pressed, held, or released.
 */
public class OI {
	Button toggleShiftModeButton = new JoystickButton(RobotIO.driveJoystick, RobotSettings.SHIFTER_MODE_SWITCH_BUTTON);
	
	public OI() {
		toggleShiftModeButton.whenPressed(new ToggleShifterMode());
	}
}
