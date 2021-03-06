package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 * ElevatorUpOperator Command
 * 
 * @author Thomas : Telling the code that it needs the designated "elevator"
 *         from the Robot.java file.
 *
 */
public class ElevatorUpOperator extends Command {

	public ElevatorUpOperator() {
		requires(Robot.elevator);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.elevator.move(Elevator.maintainSpeed);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.elevator.stop();
	}

	protected void interrupted() {
		Robot.elevator.stop();
	}

}