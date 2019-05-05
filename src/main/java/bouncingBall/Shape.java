

package bouncingBall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Shape extends JPanel implements ActionListener {

    private int size = 40;
    private int speed = 5;
    private int xPosit,yPosit,xSpeed,ySpeed;
    private Color color;

    Shape(){
        xSpeed = speed;
        ySpeed = -speed;
        Timer timer = new Timer(33,this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        int width = getWidth();
        int height = getHeight();

        //move of square
        xPosit += xSpeed;
        yPosit += ySpeed;


        if(xPosit < 0){
            xPosit = 0;
            xSpeed = speed;
            color = randomColor();
            speed = randomInt();
        }
        else if(xPosit > width - size){
            xPosit = width - size;
            xSpeed = -speed;
            color = randomColor();
            speed = randomInt();

        }
        if(yPosit < 0){
            yPosit = 0;
            ySpeed = speed;
            color = randomColor();
        }
        else if(yPosit > height - size){
            yPosit = height - size;
            ySpeed = -speed;
            color = randomColor();
        }
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(xPosit,yPosit, size, size);
    }
    private static Color randomColor() {
        Random random = new Random();

        int r = random.nextInt(255 + 1);
        int g = random.nextInt(255 + 1);
        int b = random.nextInt(255 + 1);

        return new Color(r, g, b);
    }
    private int randomInt(){
        Random random = new Random();
        int a = random.nextInt(50)+1;
        return a;
    }

}
