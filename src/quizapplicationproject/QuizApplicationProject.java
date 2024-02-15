package quizapplicationproject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class QuizApplicationProject extends JFrame {

    public QuizApplicationProject(){
     
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // image source class
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("image/login.jpeg"));
        JLabel label=new JLabel(image);
        add(label);
        label.setBounds(0, 0, 600, 500);
   
        
        JLabel lab=new JLabel("Simple Minds");
        lab.setBounds(750, 35, 300, 45);
        lab.setFont(new Font("Viner Hand ITC", Font.BOLD, 45));
        lab.setForeground(new  Color(30,144,254));
        add(lab);

        JLabel lab1=new JLabel("Enter Your Name");
        lab1.setBounds(820, 90, 300, 45);
        lab1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lab1.setForeground(new  Color(30,144,254));
        add(lab1);

    
        JTextField text=new JTextField();
        text.setBounds(750,170,250,30);
        text.setForeground(new Color(30,144,254));
        add(text);
                
        
        JButton rules=new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        add(rules);
        

        JButton back=new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        add(back);
        
        
        rules.addActionListener((e) -> {
            String name = text.getText();
            System.out.println(name);
            new Rules(name);
            setVisible(false);
        });
        
        back.addActionListener((e) -> {
             setVisible(false);
        });
        
 
        setLocation(100,150);
        setVisible(true);
        setSize(1200, 500);
    }
    public static void main(String[] args) {
        new QuizApplicationProject();
    }
    
}
