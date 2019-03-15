/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static WPI_VictorSPX
    frontRightDrive = new WPI_VictorSPX(Constants.kFrontRightMotor), 
    frontLeftDrive = new WPI_VictorSPX(Constants.kFrontLeftMotor),
    backRightDrive = new WPI_VictorSPX(Constants.kBackRightMotor), 
    backLeftDrive = new WPI_VictorSPX(Constants.kBackLeftMotor);
  public static Spark
    leftCargoIntakeMotor = new Spark(Constants.kLeftCargoIntakeMotor), 
    rightCargoIntakeMotor = new Spark(Constants.kRightCargoIntakeMotor);
}
