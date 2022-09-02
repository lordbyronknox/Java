/*

 */
package Page493.CreatingTwoMoreCountDownClockThreads;

class CountDownClockSync extends Thread {

    private int start;

    public CountDownClockSync(int start) {
        this.start = start;
    }

    synchronized public void run() {                //use 'synchronize' keyword to prevent more than one 
        for (int t = start; t >= 0; t--) {          // thread calling the run() method at the same time.
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {}
        }
    }
}
