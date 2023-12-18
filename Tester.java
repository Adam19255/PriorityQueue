public class Tester {
    public static void main(String[] args) {
        PrintingServer server = new PrintingServer();
        PrintJob p = new PrintJob("Hello", 7);
        server.acceptJob(p);
        p = new PrintJob("Good Morning", 3);
        server.acceptJob(p);
        p = new PrintJob("How do you do?", 8);
        server.acceptJob(p);
        p = new PrintJob("goodbye", 1);
        server.acceptJob(p);
        server.print();
        server.print();
        p = new PrintJob("Hello again", 10);
        server.acceptJob(p);
        server.print();
        server.print();
        server.print();
    }
}
