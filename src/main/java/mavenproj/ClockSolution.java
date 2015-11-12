package mavenproj;

import java.time.LocalTime;

/**
 * Created by varuchin on 12.11.2015.
 */
public class ClockSolution extends Thread{

    private Thread thread;
    private int count;

    public ClockSolution()
    {}

    public ClockSolution(Thread thread)
    {
        this.thread = thread;
    }

    public void setClock()
    {

        thread.start();
        while(true)
        {
            try {
                Thread.sleep(1000);
                LocalTime time = LocalTime.now();
                System.out.println(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
