
public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch(){}


    public long start(){
        this.startTime =System.currentTimeMillis();
        return this.startTime;
    }

    public long stop(){
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }


}
