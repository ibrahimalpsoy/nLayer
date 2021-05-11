package nLayerProject.core;

import nLayerProject.jLogger.JLoggerManager;

public class JloggerManagerAdapter implements LoggerService{

	@Override
	public void logSystem(String message) {
		
		JLoggerManager manager = new JLoggerManager();
		
		manager.Log(message);
		
	}

}
