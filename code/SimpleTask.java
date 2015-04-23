import kilim.Mailbox;
import kilim.Pausable;
import kilim.Task;

public class SimpleTask extends Task {
    static Mailbox<String> mb = new Mailbox<String>();    
       public void execute() throws Pausable{
        while (true) {
            String s = mb.get();
            if (s.equals("done")) break;
            System.out.print(s);
        }        
        System.exit(0);
    }
}