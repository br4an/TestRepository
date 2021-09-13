package testProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class testPorj2 {
	
	public static void main(String[] args)
	{
		String pblocation=null;
		ConcurrentHashMap pbSlot = new ConcurrentHashMap();
		pbSlot.put("AGV501", "PB.016");
		Map<String, Integer> parallelBufferDrivetime = new HashMap<String, Integer>();
		parallelBufferDrivetime.put("PB.009", -1);
		parallelBufferDrivetime.put("PB.010", -1);
		parallelBufferDrivetime.put("PB.011", -1);
		parallelBufferDrivetime.put("PB.012", -1);
		parallelBufferDrivetime.put("PB.013", -1);
		parallelBufferDrivetime.put("PB.014", -1);
		parallelBufferDrivetime.put("PB.015", -1);
		parallelBufferDrivetime.put("PB.016", -1);
		
		ArrayList<Integer> driveTime =new  ArrayList<Integer>(parallelBufferDrivetime.values());
		if (driveTime != null && driveTime.size() > 0) {
			Collections.sort(driveTime);
			for (int i = 0; i < driveTime.size(); i++) {
                for (String pb : parallelBufferDrivetime.keySet()) {
                    if (parallelBufferDrivetime.get(pb).equals(driveTime.get(i))) {
                        pblocation = pb;//PB.016
                        //added by Bran for oracle check
                        if(driveTime.get(i)==-1 && pbSlot.containsValue(pblocation))
                        {
                            continue;
                        }else {
                            break;
                        }
                    }
                }
                if (!pblocation.isEmpty() && !pbSlot.containsValue(pblocation)) {
                    pbSlot.put("AGV502", pblocation);
                    break;
                }
		}
		}
	}

	}
