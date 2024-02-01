import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Ball[] ballArray = new Ball[20];
    public MyPanel(){

        setBackground(Color.PINK);
         for(int i = 0; i<20; i++){
             ballArray[i] = new Ball(this);
         }

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<20; i++) {
            ballArray[i].draw(g);
            ballArray[i].move();
        }



        try {
            Thread.sleep(10);
        }
        catch(Exception e) {
            System.out.println(e);
        }
            repaint();

    }


}
