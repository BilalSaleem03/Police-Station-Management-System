import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PoliceForm extends JFrame
{
    JLabel id;
    JTextField idText;
    JLabel name;
    JTextField nameText;
    JLabel age;
    JTextField ageText;
    JLabel gender;
    JTextField genderText;
    JLabel post;
    JTextField postText;
    JLabel weapon;
    JTextField weaponText;
    JLabel cases;
    JTextField casesText;
    JLabel salary;
    JTextField salaryText;
    JButton submit;
    JButton home;


    PoliceForm()
    {
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(9,1));
        id = new JLabel("ID");
        idText = new JTextField(20);
        name = new JLabel("Name");
        nameText = new JTextField(20);
        age = new JLabel("Age");
        ageText = new JTextField(20);
        gender = new JLabel("Gender");
        genderText = new JTextField(20);
        post = new JLabel("Post");
        postText = new JTextField(20);
        weapon = new JLabel("Weapon");
        weaponText = new JTextField(20);
        cases = new JLabel("Cases Assigned");
        casesText = new JTextField(20);
        salary = new JLabel("Salary");
        salaryText = new JTextField(20);
        submit = new JButton("Submit");
        home = new JButton("Home");
        MyActionListener listener = new MyActionListener();
        submit.addActionListener(listener);
        home.addActionListener(listener);
        add(id);
        add(idText);
        add(name);
        add(nameText);
        add(age);
        add(ageText);
        add(gender);
        add(genderText);
        add(post);
        add(postText);
        add(weapon);
        add(weaponText);
        add(cases);
        add(casesText);
        add(salary);
        add(salaryText);
        add(submit);
        add(home);
        setVisible(true);
    } 

    class MyActionListener implements ActionListener              //so that we canaccess all the data members of SimpleGUI class
    {
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getActionCommand().equals("Submit"))
            {
                int id = Integer.parseInt(idText.getText());
                int age = Integer.parseInt(ageText.getText());
                double salary = Double.parseDouble(salaryText.getText());
                //Patient p = new Patient(id , nameText.getText() , age , genderText.getText() ,  postText.getText() , weaponText.getText() , casesText.getText() , salary);
                // Patient.writeToFile(p);
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