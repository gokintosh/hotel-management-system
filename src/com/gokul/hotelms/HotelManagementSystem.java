package com.gokul.hotelms;

import javax.swing.*;

public class HotelManagementSystem extends JFrame {

//    all codes for the frame being written in the constructor
    HotelManagementSystem(){
        setBounds(300,300,400,400);
//        setSize(400,400);
        setVisible(true);//by default it is set false
//        setLocation(500,500);
    }

    public static void main(String[] args) {
	// write your code here
        new HotelManagementSystem();
    }
}
