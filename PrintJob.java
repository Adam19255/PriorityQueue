public class PrintJob implements Prioritizeable{
    private String text;
    private int priority;

    //initializing the job
    public PrintJob(String text, int priority) {
        this.text = text;
        //checking to see that the priority doesn't go above the max
        if (priority > MAX_PRIORITY)
            this.priority = MAX_PRIORITY;
        //checking to see that the priority doesn't go below min
        else if (priority < MIN_PRIORITY)
            this.priority = MIN_PRIORITY;
        else
            this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int p) {
        this.priority = p;
    }

    public String getText(){
        return this.text;
    }
}
