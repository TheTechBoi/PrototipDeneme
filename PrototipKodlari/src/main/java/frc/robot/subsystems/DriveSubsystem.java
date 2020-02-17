/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubsystem extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */

     //Motorların tanımlanması
  Spark left_1 = new Spark(0);
  Spark left_2 = new Spark(1);

  Spark right_1 = new Spark(2);
  Spark right_2 = new Spark(3);

  //Hız kontrol grubu sağ ve sol
  SpeedControllerGroup leftGroup = new SpeedControllerGroup(left_1, left_2);
  SpeedControllerGroup rightGroup = new SpeedControllerGroup(right_1, right_2);

  //Drive sistemi
  DifferentialDrive drive = new DifferentialDrive(leftGroup, rightGroup);
  
  public DriveSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void JoystickleSurme(Double Left_Speed, Double Right_Speed)
  {
    drive.tankDrive(Left_Speed, Right_Speed);
  }
}
