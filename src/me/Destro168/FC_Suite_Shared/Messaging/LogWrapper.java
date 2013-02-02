package me.Destro168.FC_Suite_Shared.Messaging;

import java.util.logging.Logger;

import me.Destro168.FC_Suite_Shared.FC_Suite_Shared;

public class LogWrapper 
{
	public Logger log;
	private static int debugCounter;
	long startTime;
	
	public void resetDebugCounter() { debugCounter = 0; }
	
	public LogWrapper(Logger log_)
	{
		log = log_;
		debugCounter = 0;
		startTime = System.nanoTime();
	}
	
	public void log(Object text)
	{
		if (text == null)
			text = "Null";
		
		if (FC_Suite_Shared.sc.getDebug() == true)
			log.severe("[DEBUG] " + String.valueOf(text));
	}
	
	public void logText(Object text)
	{
		if (text == null)
			text = "Null";
		
		log.severe(String.valueOf(text));
	}
	
	public void logCount()
	{
		if (FC_Suite_Shared.sc.getDebug() == true)
		{
			log.severe("[DEBUG COUNTER] " + debugCounter);
			debugCounter++;
		}
	}
	
	public void logCount2()
	{
		if (FC_Suite_Shared.sc.getDebug() == true)
		{
			log.severe("[DEBUG COUNTER] " + debugCounter);
			debugCounter += 2;
		}
	}
	
	public void timeStart()
	{
		startTime = System.nanoTime();
	}
	
	public void timeEnd(String x)
	{
		if (FC_Suite_Shared.sc.getDebug() == true)
			log.severe("[TIME END - "+x+"]: " + (System.nanoTime() - startTime) + "");
		
		startTime = System.nanoTime();
	}
}





