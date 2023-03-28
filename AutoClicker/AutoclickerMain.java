import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;

public class AutoclickerMain {
    public static void main (String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" Clicker  ");

            System.out.println("Clicks");
            int clicks = scan.nextInt();

            System.out.println("Delay");
            int delay = scan.nextInt();

            System.out.println(":)");
            
   try{
            Thread.sleep(300);
   }
   catch (Exception e){
            e.printStackTrace();
   }

   Autoclicker clicker = new Autoclicker();
   clicker.setDelay(delay);

   for ( int i = 0; i < clicks; i++)
   {
            clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
   }
        }
    
    }
    
}
