package MyCalculator1;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
//    //Объявление всех компонентов калькулятора.
 // JPanel windowContent;
//    JFormattedTextField displayField;
//   Buttons[] numButtons = new Buttons[10];
//    //Создаём кнопки,используя конструктор
////классаJButton, который принимает текст
//кнопки вкачестве параметра

    JButton   button0 = new JButton("0");
    JButton    button1 = new JButton("1");
    JButton    button2 = new JButton("2");
    JButton    button3 = new JButton("3");
    JButton    button4 = new JButton("4");
    JButton    button5 = new JButton("5");
    JButton   button6 = new JButton("6");
    JButton  button7 = new JButton("7");
    JButton   button8 = new JButton("8");
    JButton   button9 = new JButton("9");


    JButton   buttonPoint = new JButton(".");
    JButton    buttonEqual = new JButton("=");

    JButton    buttonPlas =new JButton("+");
    JButton    buttonMinys =new JButton("-");
    JButton    buttonDelit =new JButton("/");
    JButton   buttonYmnogat =new JButton("*");
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);


    //Вконструкторе создаются все компоненты
//и добавляются инфреймс помощью комбинации
    // Borderlayout и Gridlayout
    Calculator() {

        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        windowContent.add("North", displayField);

        JPanel p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 1);

        p1.setLayout(gl);
//Добавляем кнопки напанел p 1p
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        //Помещаем панель p1 в центральную область окна
        windowContent.add("Center",p1);
        //Создаём кнопки,используя конструктор
//классаJButton, который принимает текст
//кнопки вкачестве параметра



//Создаёмпанельс GridLayout
//котораясодержит12 кнопок-10 кнопок с числами
//и кнопки сточкой и знаком равно
        JPanel    p2 = new JPanel();
        GridLayout gl2 = new GridLayout(2, 2);
        p2.setLayout(gl2);
        p2.add(buttonPlas);
        p2.add(buttonMinys);
        p2.add(buttonDelit);
        p2.add(buttonYmnogat);
        windowContent.add("East",p2);





        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);

        buttonPoint.addActionListener(calcEngine);
        buttonPlas.addActionListener(calcEngine);
        buttonMinys.addActionListener(calcEngine);
        buttonDelit.addActionListener(calcEngine);
        buttonYmnogat.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}