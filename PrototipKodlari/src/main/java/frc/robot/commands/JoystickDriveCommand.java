/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

/**
 * An example command that uses an example subsystem.
 */
public class JoystickDriveCommand extends CommandBase {

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  DriveSubsystem m_subsystem = new DriveSubsystem();
  public JoystickDriveCommand(DriveSubsystem subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_subsystem = subsystem;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  m_subsystem.JoystickleSurme(Robot.m_robotContainer.joyStick.getRawAxis(2), Robot.m_robotContainer.joyStick.getRawAxis(5));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
