/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class Constants {

    // Drivetrain Constants
    public static final int 
        kFrontLeftMotor = 2, 
        kFrontRightMotor = 5, 
        kBackLeftMotor = 4,
        kBackRightMotor = 3;

    public static final double
        kMinAxis = -1,
        kMaxAxis = 1,
        kLowRangeTurn = 0.2,
        kHighRangeTurn = 1;
    // OI Constants
    public static final int
        kDriveStickPort = 0,
        kOperatorControllerPort = 1,
        kIntakeCargoButton = 1,
        kIntakeHatchButton = 12,
        kOuttakeHatchButton = 6;

    // Cargo Intake Constants
    public static final int 
        kLeftCargoIntakeMotor = 0, 
        kRightCargoIntakeMotor = 1;
 
    // Climber Constants
    public static final int 
        kClimberLiftPort = 2, 
        kClimberWheelPort = 3;
    
    // Arm Constants
    public static final int 
        kArmMasterPort = 6,
        kArmSlavePort = 7;
    
    public static final double
        kG = 0.1;

    // Hatch Intake Constants
    public static final int 
        kHatchIntakeWheelPort = 0, 
        kHatchIntakePivotPort = 0;
}
