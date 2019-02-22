package frc.robot.commands;

public interface Sensor {

	public void init();

	public double get();

	public void calibrate();

	public void reset();

}