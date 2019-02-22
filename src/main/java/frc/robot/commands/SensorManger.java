package frc.robot.commands;


public class SensorManger {
    
    private static SensorManger instance = new SensorManger(null);

    public static SensorManger getInstance() {
        return instance;
    
    }

    Sensor getDriveEncoder() {
        return getDriveEncoder();
    
    }

    private SensorManger(DriveEncoder getDriveEncoder) {

        getDriveEncoder = new DriveEncoder();
    
        getDriveEncoder.init();

    }
}