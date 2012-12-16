package me.Destro168.FC_Suite_Shared.ConfigManagers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;

public class ListGetter
{
	FileConfigurationWrapper fcw;
	String field;
	int breakCounter;
	
	public ListGetter(FileConfigurationWrapper fcw_, String field_)
	{
		fcw = fcw_;
		field = field_;
		breakCounter = 0;
	}
	
	public List<String> getStringList()
	{
		List<String> a = new ArrayList<String>();
		String b;
		
		for (int i = 0; i < 999999; i++)
		{
			try {
				b = fcw.getString(field + "." + i);
				a.add(b);
			} catch (NullPointerException e) {
				breakCounter++;
				
				if (breakCounter > 50)
					return a;
			}
		}
		
		return a;
	}
	
	public List<Location> getLocationList()
	{
		List<Location> a = new ArrayList<Location>();
		Location b;
		
		for (int i = 0; i < 999999; i++)
		{
			try {
				b = fcw.getLocation(field + "." + i);
				a.add(b);
			} catch (NullPointerException e) {
				breakCounter++;
				
				if (breakCounter > 50)
					return a;
			}
		}
		
		return a;
	}
}