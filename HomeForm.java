import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeForm extends JFrame
{
    JButton police;
    JButton prisoner;
    JButton vehicle;
    JButton exit;


    HomeForm()
    {
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));

        police = new JButton("Police");
        prisoner = new JButton("prisoner");
        vehicle = new JButton("Vehicle");
        exit = new JButton("Exit");

        MyActionListener listener = new MyActionListener();
        police.addActionListener(listener);
        prisoner.addActionListener(listener);
        vehicle.addActionListener(listener);
        exit.addActionListener(listener);
        add(police);
        add(prisoner);
        add(vehicle);
        add(exit);
        setVisible(true);
    } 

    class MyActionListener implements ActionListener              //so that we canaccess all the data members of SimpleGUI class
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getActionCommand().equals("Police"))
            {
                
            }
            else if(ae.getActionCommand().equals("Prisoner"))
            {
                dispose();
                // Home h = new Home();
            }
            else if(ae.getActionCommand().equals("Vehicle"))
            {
                dispose();
                // Home h = new Home();
            }
            else
            {
                System.exit(0);
                //JOptionPane.showMessageDialog(null,"aaaaa");
            }
        }
    }

}
