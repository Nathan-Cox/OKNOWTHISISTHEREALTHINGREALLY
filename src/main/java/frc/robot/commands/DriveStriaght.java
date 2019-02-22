package frc.robot.commands;

public class DriveStriaght implements Command {

    private SensorManger sensors = SensorManger.getInstance();
    private PIDControl pid;

    private Sensor encode = sensors.getDriveEncoder();

    private double distance;

    private double headingTarget;

    private PIDControl driveStrait;

    public DriveStriaght(double dist, double max_output) {
		distance = dist * -1; // Set up the PID loop

		pid = new PIDControl(0.09, 0, 7); // .4.2.5
		pid.setOutputRampRate(0.05);
		pid.setOutputLimits(max_output);
		pid.setSetpointRange(10);
		//
		driveStrait = new PIDControl(0.09, 0, 7);

		driveStrait.setOutputLimits(0.4);
		driveStrait.setOutputRampRate(0.05);
	}



    @Override
    public void init() {

    }

    @Override
    public void execute() {

    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean interupted() {
        return false;
    }

    @Override
    public boolean started() {
        return false;
    }

}