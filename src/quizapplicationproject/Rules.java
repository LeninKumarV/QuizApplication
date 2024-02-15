
package quizapplicationproject;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class Rules extends JFrame{
    
    String name;
    
    public Rules(String name){
        this.name=name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel lab1=new JLabel("Welcome "+name+" to Simple Minds");
        lab1.setBounds(80, 20, 700, 40);
        lab1.setForeground(new Color(30,144,254));
        lab1.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        add(lab1);
        
        
        JLabel lab2=new JLabel();
        lab2.setBounds(50,40,700,400);
        lab2.setForeground(Color.BLACK);
        lab2.setFont(new Font("Times New Roman",Font.PLAIN,15));
        lab2.setText( "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(lab2);
        
        
        JButton start=new JButton("Start");
        start.setBounds(150, 450, 120, 25);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        add(start);
        
        start.addActionListener((e) -> {
            setVisible(false);
            new Quiz(name);
        });

        JButton back=new JButton("Back");
        back.setBounds(400, 450, 120, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        add(back);
        
        
        back.addActionListener((e) -> {
            setVisible(false);
        });
        
        setVisible(true);
        setLocation(300, 100);
        setSize(700,600);
    }
    
    
    public static void main(String[] args)throws UnsupportedOperationException{
        
        new Rules();
    }

    private Rules() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
