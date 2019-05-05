package bouncingBall;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        init();
    }


    private static void init() {
        JFrame frame = new JFrame("Bouncing Squares");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

        Shape shape = new Shape();
//        bouncingBall.Shape square1 = new bouncingBall.Shape();
        shape.setBackground(new Color(180,180,180));
        frame.add(shape);
//        frame.add(square1);
    }



}

