import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Test extends JFrame implements ActionListener
{
    JButton data, wyjscie;
    JLabel showdata;
    public  Test()
    {
        setSize(450,300);
        setTitle("Prosty program");
        setLayout(null);
        this.getContentPane().setBackground(Color.darkGray);

        data = new JButton("Podaj datę");
        data.setBounds(100, 100 ,100, 20);
        add(data);
        data.addActionListener(this);

        wyjscie = new JButton("Wyjście");
        wyjscie.setBounds(250, 100, 100 ,20);
        add(wyjscie);
        wyjscie.addActionListener(this);

        showdata = new JLabel("Data:");
        showdata.setBounds(100, 175 ,250, 20);
        showdata.setForeground(Color.LIGHT_GRAY);
        showdata.setFont(new Font("Sans Serif",Font.BOLD,15));
        add(showdata);
    }

    public static void main(String[] args)
    {
        Test okno = new Test();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == data)
        {
            showdata.setText(new Date().toString());
        }
        else if (source == wyjscie)
        {
            dispose();
        }
    }
}
