package calories;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaloriesCalculator {

    private JRadioButton rbtnMale;
    private JRadioButton rbtnFemale;
    private JTextField txtFeet;
    private JTextField txtInches;
    private JTextField txtWeight;
    private JTextField txtAge;
    private JTextField txtCalories;
    private JButton btnCalculate;

    public void InitializeComponent() {
        JFrame jFrame = new JFrame("CaloriesCalculator");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panelRadio = getPanelRadio();

        JPanel panelHeight = getPanelHeight();

        JPanel panelWeight = getPanelWeight();

        JPanel panelAge = getPanelAge();

        JPanel panelCalc = getPanelCalculator();

        JPanel panelCalories = getPanelCalories();

        Box vBox = Box.createVerticalBox();
        vBox.add(panelRadio);
        vBox.add(panelHeight);
        vBox.add(panelWeight);
        vBox.add(panelAge);
        vBox.add(panelCalc);
        vBox.add(panelCalories);

        jFrame.setContentPane(vBox);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    private JPanel getPanelRadio() {
        JPanel panalRadio = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup btnGroup = new ButtonGroup();
        rbtnMale = new JRadioButton("Male");
        rbtnFemale = new JRadioButton("Female");
        rbtnMale.setSelected(true);
        btnGroup.add(rbtnMale);
        btnGroup.add(rbtnFemale);
        panalRadio.add(rbtnMale);
        panalRadio.add(rbtnFemale);
        return panalRadio;
    }

    private JPanel getPanelHeight() {
        JPanel panelHeight = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelHeight.add(new JLabel(" Height:"));
        txtFeet = new JTextField("5", 8);
        panelHeight.add(txtFeet);
        panelHeight.add(new JLabel("ft"));
        txtInches = new JTextField("1", 8);
        panelHeight.add(txtInches);
        panelHeight.add(new JLabel("in"));
        return panelHeight;
    }

    private JPanel getPanelWeight() {
        JPanel panelWeight = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelWeight.add(new JLabel("Weight:"));
        txtWeight = new JTextField("110", 8);
        panelWeight.add(txtWeight);
        panelWeight.add(new JLabel("lb"));
        return panelWeight;
    }

    private JPanel getPanelAge() {
        JPanel panelAge = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelAge.add(new JLabel("      Age:"));
        txtAge = new JTextField("12", 8);
        panelAge.add(txtAge);
        panelAge.add(new JLabel("year"));
        return panelAge;
    }

    private JPanel getPanelCalories() {
        JPanel panelCalories = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCalories.add(new JLabel("Recommended Daily Amount:"));
        txtCalories = new JTextField(8);
        panelCalories.add(txtCalories);
        return panelCalories;
    }

    private JPanel getPanelCalculator() {
        JPanel panelCalc = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                calculate();
            }
        });
        panelCalc.add(btnCalculate);
        return panelCalc;
    }

    private void calculate() {
        Double weight = Double.valueOf(txtWeight.getText());
        Double height = Double.valueOf(txtFeet.getText());
        Double inch = Double.valueOf(txtInches.getText());
        Double age = Double.valueOf(txtAge.getText());
        Boolean maleSelected = rbtnMale.isSelected();

        Double calories = caloriesCalculator(maleSelected, weight, height, inch, age);
        txtCalories.setText(calories.toString());
    }

    public Double caloriesCalculator(Boolean maleSelected, Double weight, Double height, Double inch, Double age) {
        Person person = maleSelected ? new Male(weight, height, inch, age) :
                new Female(weight, height, inch, age);
        return person.caloriesCalculator();
    }


    public static void main(String[] args) {
        CaloriesCalculator cc = new CaloriesCalculator();
        cc.InitializeComponent();
    }
}
