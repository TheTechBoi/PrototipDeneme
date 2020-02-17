/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.JoystickDriveCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.commands.AutonomCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem m_drivesubs;
  private final IntakeSubsystem m_intakesubs;
  private final ShooterSubsystem m_shootersubs;

  private final JoystickDriveCommand m_jDrivecommand;
  private final IntakeCommand m_intakecommand;
  private final ShooterCommand m_shootercommand;
  private final AutonomCommand m_autocommand;

  public static Joystick joyStick;




  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    m_drivesubs = new DriveSubsystem();
    m_jDrivecommand = new JoystickDriveCommand(m_drivesubs);

    m_intakesubs = new IntakeSubsystem();
    m_intakecommand = new IntakeCommand(m_intakesubs);

    m_shootersubs = new ShooterSubsystem();
    m_shootercommand = new ShooterCommand(m_shootersubs);

    joyStick = new Joystick(0);

    m_autocommand = new AutonomCommand();

    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton intakeButton = new JoystickButton(joyStick, 1); // Creates a new JoystickButton object for button 1 on exampleStick
    JoystickButton shooterButton = new JoystickButton(joyStick, 2); // Creates a new JoystickButton object for button 1 on exampleStick
    intakeButton.whenPressed(m_intakecommand);
    shooterButton.whenPressed(m_shootercommand);
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return(m_autocommand);
  }
}
