package com.example.carrenttimisoara;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rental{

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    //////////////////////////////////////////////////////////MAIN//////////////////////////////////////////
    public static void main(String[] args) {

        JFrame frame = new RentalView();
        ImageIcon img = new ImageIcon("C:\\Users\\fifa_\\OneDrive\\Desktop\\Rental\\Car Rental Galben Casian\\images\\logo.GIF");
        frame.setIconImage(img.getImage());
        frame.setTitle("Rent.Car.TM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
