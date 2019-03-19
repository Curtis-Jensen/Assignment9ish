package test;

import javax.swing.*;

public class Assignment9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        FrameTest test = new FrameTest();
        frame.setTitle("Assignment 9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationByPlatform(true);
        frame.setContentPane(test);  //Commented out for compiler error
        frame.pack();
        frame.setVisible(true);


        frame.add(test);

    }
}
