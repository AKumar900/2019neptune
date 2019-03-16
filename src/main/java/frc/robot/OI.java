/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.cargointake.IntakeCargo;
import frc.robot.commands.hatchintake.IntakeHatch;
import frc.robot.commands.hatchintake.OuttakeHatch;
import frc.robot.commands.vision.AlignToTarget;

public class OI {
  public Joystick
    driveStick = new Joystick(Constants.kDriveStickPort);
  
  public XboxController
    operatorController = new XboxController(Constants.kOperatorControllerPort);

  public Button
    intakeCargo = new JoystickButton(driveStick, Constants.kIntakeCargoButton),
    intakeHatch = new JoystickButton(driveStick, Constants.kIntakeHatchButton),
    outtakeHatch = new JoystickButton(operatorController, Constants.kOuttakeHatchButton),
    alignToTarget = new JoystickButton(driveStick, Constants.kAlignToTargetButton);
    
    public OI() {
      intakeCargo.whileHeld(new IntakeCargo());
      intakeHatch.whileHeld(new IntakeHatch());
      outtakeHatch.whileHeld(new OuttakeHatch());
      alignToTarget.whileHeld(new AlignToTarget());
    }
}
