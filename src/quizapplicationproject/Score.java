package quizapplicationproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Score extends JFrame{
    public Score(String name,int score){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(400, 150, 750, 550);

        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("image/score.png"));
        Image i2=image.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0, 200, 300, 250);
        add(label);
     
        
        JLabel lab=new JLabel("Thank You "+ name+" for playing Simple Minds");
        lab.setBounds(45, 30, 700, 30);
        lab.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lab.setForeground(new  Color(30,144,254));
        add(lab);

        JLabel lab1=new JLabel("Your Score is"+score);
        lab1.setBounds(350, 200, 300, 30);
        lab1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lab1.setForeground(Color.CYAN);
        add(lab1);
        
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(400, 270, 120,30);
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.WHITE);
        add(submit);
        
        submit.addActionListener((e) -> {
              setVisible(false);
              new QuizApplicationProject();
        });
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Score();
    }

    private Score() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
