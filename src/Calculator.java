import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private double firstNum = 0;
    private double secondNum = 0;
    private double result = 0;
    private char op;

    private JPanel Calculator;
    private JTextField txt;
    private JButton btnClear;
    private JButton btnPOM;
    private JButton btn2;
    private JButton btn3;
    private JButton btnPlus;
    private JButton btn1;
    private JButton btn6;
    private JButton btnMin;
    private JButton btn5;
    private JButton btn4;
    private JButton btn9;
    private JButton btnMul;
    private JButton btn8;
    private JButton btn7;
    private JButton btnEquals;
    private JButton btnPoint;
    private JButton btnDiv;
    private JButton btn0;

    public Calculator() {
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
            }
        });

        btnPOM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = 0;
                num = Double.parseDouble(txt.getText());
                txt.setText(Double.toString(num*-1));
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn1.getText();
                txt.setText(text);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn2.getText();
                txt.setText(text);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn3.getText();
                txt.setText(text);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn4.getText();
                txt.setText(text);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn5.getText();
                txt.setText(text);
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn6.getText();
                txt.setText(text);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn7.getText();
                txt.setText(text);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn8.getText();
                txt.setText(text);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn3.getText();
                txt.setText(text);
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btn0.getText();
                txt.setText(text);
            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText()+btnPoint.getText();
                txt.setText(text);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = firstNum + Double.parseDouble(txt.getText());
                txt.setText("");
                op = '+';
            }
        });

        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = firstNum + Double.parseDouble(txt.getText());
                txt.setText("");
                op = '-';
            }
        });

        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = firstNum + Double.parseDouble(txt.getText());
                txt.setText("");
                op = '*';
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = firstNum + Double.parseDouble(txt.getText());
                txt.setText("");
                op = '/';
            }
        });

        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNum = Double.parseDouble(txt.getText());
                switch (op){
                    case '+': result = secondNum + firstNum;
                                txt.setText(Double.toString(result));
                                firstNum = 0;
                                break;
                    case '-': result = secondNum - firstNum;
                                txt.setText(Double.toString(result));
                                firstNum = 0;
                                break;
                    case '*': result = secondNum * firstNum;
                                txt.setText(Double.toString(result));
                                firstNum = 0;
                                break;
                    case '/': result = secondNum / firstNum;
                                txt.setText(Double.toString(result));
                                firstNum = 0;
                                break;
                    default: txt.setText("");
                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
