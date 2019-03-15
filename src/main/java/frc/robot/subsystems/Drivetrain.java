/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.drivetrain.ArcadeDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  private static Drivetrain instance = new Drivetrain();

  public static Drivetrain getInstance() {
    return instance;
  }

  private static SpeedControllerGroup
    leftMotors = new SpeedControllerGroup(RobotMap.frontLeftDrive, RobotMap.backLeftDrive),
    rightMotors = new SpeedControllerGroup(RobotMap.frontRightDrive, RobotMap.backRightDrive);
  
  public void setDriveMotors(double leftVoltage, double rightVoltage) {
    leftMotors.set(leftVoltage);
    rightMotors.set(rightVoltage);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArcadeDrive());
  }
}
