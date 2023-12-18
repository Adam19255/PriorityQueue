public class PriorityQueue{

    private Prioritizeable[] queue;

    //default constructor
    public PriorityQueue(){
        this.queue = new Prioritizeable[100];
    }

    public void insert(Prioritizeable element) {
        //two values, one to check if we can use the next and one to compare to
        Prioritizeable next = null;
        Prioritizeable change = element;
        int last = queue.length - 1;
        for (int i=0; i< queue.length-1; i++){
            //checking if the first spot is free and adding the element there
            if (queue[0] == null){
                queue[0] = element;
                break;
            }
            //checking if the first priority is lower than the one we get and inserting it to the first
            else if (queue[i] == null || queue[i].getPriority() < change.getPriority()){
                //moving all the jobs to the next spot
                if (next != null){
                    Prioritizeable temp = queue[i];
                    queue[i] = change;
                    next = temp;
                    change = temp;
                }
                //replacing the jobs depending on the priority
                else {
                    next = queue[i];
                    change = queue[i];
                    queue[i] = element;
                }
                //break point, so we won't copy the same job to the next place
                if (next == null)
                    break;
            }
            //checking if the priority we get is lower or the same with the previous ones and higher than the next ones
            //and placing the job between them
            else if (queue[i].getPriority() >= change.getPriority() &&
                    (queue[i+1] == null || queue[i+1].getPriority() < change.getPriority())){
                //moving all the jobs to the next spot
                if(next != null)
                {
                    Prioritizeable temp = queue[i + 1];
                    queue[i+1] = change;
                    next = temp;
                    change = temp;
                }
                //placing the job in the correct place
                else
                {
                    next = queue[i+1];
                    change = queue[i+1];
                    queue[i+1] = element;
                }
                //break point, so we won't copy the same job to the next place
                if (next == null)
                    break;
            }
        }
    }

    public Prioritizeable remove(){
        //checking if there is a job there
        if (queue[0] != null) {
            //removing the job from the array and placing null
            Prioritizeable first = queue[0];
            queue[0] = null;
            //moving all the over jobs to left
            for (int i=1; i< queue.length; i++){
                queue[i-1] = queue[i];
                queue[i] = null;
            }
            //returning the first job
            return first;
        }
        //if there is no job we return null
        return null;
    }

    public String toString(){
        //printing the jobs
        String res = "";
        for (int k = 0; k< queue.length; k++)
            res += queue[k] + "\n";
        return res;
    }
}