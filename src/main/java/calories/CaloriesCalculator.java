package calories;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CaloriesCalculator {

    private JTextField txtFeet;
    private JTextField txtInches;
    private JTextField txtWeight;
    private JTextField txtAge;
    private JTextField txtCalories;
    private JButton btnCalculate;

    private List<JRadioButton> radioGardenList;

    public void InitializeComponent() {
        JFrame jFrame = new JFrame("CaloriesCalculator");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panelRadio = initPanelRadio();

        JPanel panelHeight = initPanelHeight();

        JPanel panelWeight = initPanelWeight();

        JPanel panelAge = initPanelAge();

        JPanel panelCalc = initPanelCalculator();

        JPanel panelCalories = initPanelCalories();

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

    private JPanel initPanelCalories() {
        JPanel panelCalories = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCalories.add(new JLabel("Recommended Daily Amount:"));
        txtCalories = new JTextField(8);
        panelCalories.add(txtCalories);
        return panelCalories;
    }

    private JPanel initPanelCalculator() {
        JPanel panelCalc = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(arg0 -> Calculate());
        panelCalc.add(btnCalculate);
        return panelCalc;
    }

    private JPanel initPanelAge() {
        JPanel panelAge = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelAge.add(new JLabel("      Age:"));
        txtAge = new JTextField("12", 8);
        panelAge.add(txtAge);
        panelAge.add(new JLabel("year"));
        return panelAge;
    }

    private JPanel initPanelWeight() {
        JPanel panelWeight = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelWeight.add(new JLabel("Weight:"));
        txtWeight = new JTextField("110", 8);
        panelWeight.add(txtWeight);
        panelWeight.add(new JLabel("lb"));
        return panelWeight;
    }

    private JPanel initPanelHeight() {
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

    private JPanel initPanelRadio() {
        JPanel panelRadio = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup btnGroup = new ButtonGroup();
        radioGardenList = initGardenData();
        radioGardenList.get(0).setSelected(true);
        for (JRadioButton radioButton : radioGardenList) {
            btnGroup.add(radioButton);
            panelRadio.add(radioButton);
        }
        return panelRadio;
    }

    public List<JRadioButton> initGardenData() {
        List<JRadioButton> gardenList = new ArrayList<>();
        for (GenderEnum value : GenderEnum.values()) {
            gardenList.add(new JRadioButton(value.getGarden()));
        }
        return gardenList;
    }

    private void Calculate() {
        Optional<JRadioButton> first = radioGardenList.stream().filter(AbstractButton::isSelected).findFirst();
        String selectSex = first.map(AbstractButton::getText).orElse(null);
        Double weight = Double.valueOf(txtWeight.getText());
        Double inch = Double.valueOf(txtInches.getText());
        Double age = Double.valueOf(txtAge.getText());
        Double feet = Double.valueOf(txtFeet.getText());

        txtCalories.setText(calculateCalories(selectSex, weight, inch, age, feet));
    }

    public String calculateCalories(String selectGender, Double weight, Double inch, Double age, Double feet) {
        return new Person(GenderEnum.getByGarden(selectGender), weight, inch, age, feet).calculateCalories();
    }


    public static void main(String[] args) {
        CaloriesCalculator cc = new CaloriesCalculator();
        cc.InitializeComponent();
    }
}
