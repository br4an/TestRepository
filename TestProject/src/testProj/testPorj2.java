package testProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class testPorj2 {
	
	public static void main(String[] args)
	{
		String location=null;
		ConcurrentHashMap Slot = new ConcurrentHashMap();
		Slot.put("BBB", "016");
		Map<String, Integer> parallelBufferDrivetime = new HashMap<String, Integer>();
		parallelBufferDrivetime.put("009", 150);
		parallelBufferDrivetime.put("010", 62);
		parallelBufferDrivetime.put("011", 32);
		parallelBufferDrivetime.put("012", 52);
		parallelBufferDrivetime.put("013", 50);
		parallelBufferDrivetime.put("014", 78);
		parallelBufferDrivetime.put("015", 15);
		parallelBufferDrivetime.put("016", 41);
		
		ArrayList<Integer> driveTime =new  ArrayList<Integer>(parallelBufferDrivetime.values());
		if (driveTime != null && driveTime.size() > 0) {
			Collections.sort(driveTime);
			for (int i = 0; i < driveTime.size(); i++) {
                for (String pb : parallelBufferDrivetime.keySet()) {
                    if (parallelBufferDrivetime.get(pb).equals(driveTime.get(i))) {
                        location = pb;//PB.016
                        if(driveTime.get(i)==-1 && Slot.containsValue(location))
                        {
                            continue;
                        }else {
                            break;
                        }
                    }
                }
                if (!location.isEmpty() && !Slot.containsValue(location)) {
                	System.out.println("reserved " + location);
                    Slot.put("AAA", location);
                    break;
                }
		}
		}
	}

	}
