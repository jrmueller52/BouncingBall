import java.awt.*;

public class Ball {
   private int size;
   private Color color;
   private int speedx;
private int speedy;
   private int x, y;
   private MyPanel panel;

   public Ball(MyPanel panel){
       x = (int)(Math.random()*500+1);
       y = (int)(Math.random()*500+1);
       size = (int)(Math.random()*30+15);
       speedx = (int)(Math.random()*6+2);
       speedy = (int)(Math.random()*6+2);
       color = new Color((int)(Math.random()*200+20),(int)(Math.random()*200+20),(int)(Math.random()*200+20));
       this.panel = panel;
   }

   public void draw(Graphics g2){
       g2.setColor(color);
       g2.fillOval(x,y,size, size);
   }

   public void move(){
      if((x>= panel.getWidth()-20) || (x<= 0)){
          speedx = speedx*-1;
           x+=speedx;
           y+=speedy;
      }
      else if((y<=0) || (y>= panel.getHeight()-20)){

          speedy = speedy*-1;
          x+=speedx;
          y+=speedy;
      }

      else{
           x+=speedx;
           y+=speedy;
       }
      }
   }


