/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.RobotMap;


public class HatchIntake extends InstantCommand {
  private static HatchIntake instance;

  public static HatchIntake getInstance() {
    return instance;
  }

  public Spark 
    hatchWheel = RobotMap.hatchWheel;
  
  public WPI_TalonSRX
    hatchPivot = RobotMap.hatchPivot;
  
  public void intake() {
    hatchWheel.set(0.5);
  }

  public void outtake() {
    hatchWheel.set(-1.0);
  }
  
  

  // Called once when the command executes
  @Override
  protected void initialize() {

  }

}
