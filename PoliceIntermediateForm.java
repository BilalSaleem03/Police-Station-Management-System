
    

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PoliceIntermediateForm extends JFrame
{

    JButton addPolice;
    JButton searchByID;
    JButton showAll;
    JButton updateInfo;
    JButton delete;
    JButton home;


    PoliceIntermediateForm()
    {
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,1));


        addPolice = new JButton("Add Police");
        searchByID = new JButton("Search Police");
        showAll = new JButton("Display All");
        updateInfo = new JButton("Update");
        delete = new JButton("Delete");
        home = new JButton("Home");
        MyActionListener listener = new MyActionListener();
        addPolice.addActionListener(listener);
        searchByID.addActionListener(listener);
        showAll.addActionListener(listener);
        updateInfo.addActionListener(listener);
        delete.addActionListener(listener);
        home.addActionListener(listener);
        add(addPolice);
        add(searchByID);
        add(showAll);
        add(updateInfo);
        add(delete);
        add(home);
        setVisible(true);
    } 

    class MyActionListener implements ActionListener              //so that we canaccess all the data members of SimpleGUI class
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getActionCommand().equals("Submit"))
            {
                // int id = Integer.parseInt(idText.getText());
                // int age = Integer.parseInt(ageText.getText());
                // double salary = Double.parseDouble(salaryText.getText());
                // //Patient p = new Patient(id , nameText.getText() , age , genderText.getText() ,  postText.getText() , weaponText.getText() , casesText.getText() , salary);
                // // Patient.writeToFile(p);
            }
            else if(ae.getActionCommand().equals("Home"))
            {
                dispose();
                // Home h = new Home();
            }
            else
            {
                //JOptionPane.showMessageDialog(null,"aaaaa");
            }
        }
    }

}