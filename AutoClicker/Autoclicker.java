import java.awt.Robot;

 public class Autoclicker
{
    private Robot robot; 
    private int delay; 

    public Autoclicker(){
        
        try{
            robot = new Robot();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        delay = 300;
    }

    public void clickMouse(int button) {
        try{
        robot.mousePress(button);
        robot.delay(230);
        robot.mouseRelease(button);
        robot.delay(delay);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
        public int setDelay(int ms) {
           return  this.delay = ms;
    }
}