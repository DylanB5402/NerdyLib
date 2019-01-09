package com.nerdherd687.lib.drivetrain.auto;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Wait time
 */

public class WaitTime extends Command {

    private double m_time;
    private double m_startTime;

    /**
     * @param time
     */
    public WaitTime(double time) {
	m_time = time;

//	requires(m_drive);
    }

    @Override
    protected void initialize() {
	SmartDashboard.putString("Current Drive Command", "WaitTime");
//	m_drive.stopDrive();

	m_startTime = Timer.getFPGATimestamp();
    }

    @Override
    protected void execute() {
    }

    @Override
    protected boolean isFinished() {
	return Timer.getFPGATimestamp() >= m_time + m_startTime;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
	end();
    }

}
