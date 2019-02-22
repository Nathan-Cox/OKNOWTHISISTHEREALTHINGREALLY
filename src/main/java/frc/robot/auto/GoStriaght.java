package frc.robot.auto;

import edu.wpi.first.wpilibj.Controller;
import frc.robot.DashUtil;
import frc.robot.commands.CommandManager;
import frc.robot.commands.DriveStriaght;

public class GoStriaght implements Controller {
	private CommandManager commands = CommandManager.getInstance();

	public void start() {
        try {
			queSequential(new DriveStriaght(10, 0.75));
		} catch (NullPointerException e) {
			DashUtil.getInstance().log("Error with automode, command was null :(");
		}

	}

	private void queSequential(DriveStriaght driveStriaght) {
    }

    public void stop() {
		commands.stop();
	}

	@Override
	public void enable() {
		
	}

	@Override
	public void disable() {
		
	}
}    

