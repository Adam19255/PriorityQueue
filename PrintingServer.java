public class PrintingServer {

    private PriorityQueue sever;

    //default constructor
    public PrintingServer(){
        this.sever = new PriorityQueue();
    }

    //getting a job and placing it in the correct place depending on the priority
    public void acceptJob(PrintJob p){
        this.sever.insert(p);
    }

    //printing the job one after one and removing the one we printed
    public void print(){
        PrintJob p = (PrintJob)this.sever.remove();
        if (p != null)
            System.out.print(p.getText() +"\n");
    }
}
