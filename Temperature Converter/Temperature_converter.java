import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Temperature_converter
{
   
    public static JFrame f;
    public static JLabel Celsius;
    public static JTextField textCelsius;
    public static JLabel Fahrenheit;
    public static JTextField textFahrenheit;
    public static JButton CalculateCtoF;
    public static JButton CalculateFtoC;
    public static JButton clear= new JButton("Clear");
    ;
    public static void main(String[] args)
    {
       
        f = new JFrame("Temperature Converter");
        f.setSize(500, 300);
        f.setLayout(new FlowLayout());
    
        
        Celsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);
        Fahrenheit = new JLabel("Fahrenheit:");
        Fahrenheit.setBounds(20, 40,15,15);
        textFahrenheit = new JTextField(10);
        textFahrenheit.setBounds(20, 40,15,15);
        CalculateCtoF = new JButton("Convert Celcius to Fahrenheit");
       
        CalculateCtoF.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    String cText = textCelsius.getText();
                    double c = Double.parseDouble(cText);
                    double f = (c * 9 / 5) + 32;
                    textFahrenheit.setText(String.valueOf(f));
                }
            }
        );
        
        CalculateFtoC = new JButton("Convert Fahrenheit to Celcius");
       
        CalculateFtoC.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Convert F to C
                    String fText = textFahrenheit.getText();
                    double f = Double.parseDouble(fText);
                    double c = (f - 32) * 5 / 9;
                    textCelsius.setText(String.valueOf(c)); 
                }
            }
        );
        clear.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   textCelsius.setText("");
                   textFahrenheit.setText("");
                }
            }
        );
        clear.setBounds(20, 50, 20, 20);
        f.add(Celsius);
        f.add(textCelsius);
        f.add(Fahrenheit);
        f.add(textFahrenheit);
        f.add(CalculateCtoF);
        f.add(CalculateFtoC);
        f.add(clear);
       
        f.setVisible(true);
    }
}