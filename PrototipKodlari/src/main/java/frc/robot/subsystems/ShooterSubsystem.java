/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  /**
   * Creates a new ShooterSubsystem.
   */

  Spark motor_shooter = new Spark(5);
  Spark motor_shooter2 = new Spark(6);


  public ShooterSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runShooter(double speed){
    if(!Constants.isShooter){
    motor_shooter.set(speed);
    motor_shooter2.set(speed);
    Constants.isShooter = true;
    }
    else{
      motor_shooter.set(0);
      motor_shooter2.set(0);
      Constants.isShooter = false;
    }
  }
}
