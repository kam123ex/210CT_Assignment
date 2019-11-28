package Week4_Advanced;

import miscLib.SimpleInput;  

public class SimBusStop {  
  
    public static void main(String[] args) {  
    ArrayQueue t = new ArrayQueue(50);  
    int code, time, count;  
    Integer item;  
    int totalPeople = 0;  
    int totalBus = 0;  
    int totalSeat = 0;  
    int outstandingWait = 0;  
    int people = 0;  
    int wait = 0;  
  
    
        do  
        {  
        	// Check whether the input person or the bus.
            code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");  
        } while (code < -1 || code > 1);  
  
        int lastTime = 0;  
  
        while (code!=-1)  
        {  
            do  
            {  
            	// Input passengers arrive at time.
                time = SimpleInput.getInteger("Arrival time (>="+Integer.toString(lastTime)+"): ");  
            } while (lastTime > time);  
  
            lastTime = time;  
  
            do  
            {  
            	// Input number of arrivals or capacity of buses
                count = SimpleInput.getInteger("Arrival count (> 0): ");  
            } while (count <= 0);  
  
            // output the triplet (for checking)  
            System.out.println(code + "  " + time + "  " + count);  
  
            	
            if (code==0)  // Add the people to the list
            {  
                totalPeople += count;  
                while (count-- > 0)  
                    t.enqueue (new Integer(time));  
            }  
            else  
                if (code==1)  // Add the bus to the list
                {  
                    totalBus++;  
                    while ( (count > 0) && !t.empty ())  
                    {  
                        item = (Integer) t.dequeue ();  
                        wait += time - item.intValue();  
                        people++;  
                        count--;  
                    }  
                    totalSeat += count;  
                }  
  
                do  
                {  
                    code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");  
                } while (code < -1 || code > 1);  
            }  
  
        // check the people got on bus  
        if (people != 0) {  // some people got on the bus  
            System.out.println (people + " people waited for " +  
                                wait + " minutes, average waiting time = " +  
                                (float) wait/people + " minutes.");  
        }  
        else {  // no one got on the bus  
            System.out.println ("0 people go on the bus.");  
        }  
  
        // check buses passed the bus stop  
        if (totalBus != 0) {    // some buses did pass the bus stop  
            System.out.println ("Number of buses passed the bus stop = " + totalBus);  
            System.out.println ("Average number of people got on a bus = " +  
                                (float) people/totalBus);  
            System.out.println ("Average number of vacant seats for a bus = " +  
                                (float) totalSeat / totalBus );  
        }  
        else {  // no bus passed the bus stop  
            System.out.println("0 bus passed the bus stop.");  
        }  
  
        // check the people still waiting at the bus stop  
        System.out.print ("Number of people still waiting = " +  
                                            (totalPeople - people)  );  
        if (!t.empty()) {  
            while (!t.empty ()) {  
                item = (Integer) t.dequeue ();  
                outstandingWait += lastTime - item.intValue();  
            }  
            System.out.println(" with average waiting time = " +  
                                (float) outstandingWait / (totalPeople - people) + " minutes");  
        }  
        else {  
            System.out.println(" with average waiting time = 0.0 minute");  
        }  
  
        System.exit(0);  
  
    } 
    
//    0 2 2 : 2 passengers arrive at time=2 
//    0 6 1 : 1 passenger arrives at time=6 
//    1 7 5 : a bus of capacity 5 arrives at time=7 
//    0 8 2 : 2 passengers arrive at time=8 
//    1 10 7 : a bus of capacity 7 arrives at time=10
//
//    5 people waited for 15 minutes, average waiting time = 3.00 minutes.
} 