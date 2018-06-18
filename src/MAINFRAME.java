import java.awt.*;



import java.awt.event.*;



import javax.swing.*;

import javax.swing.event.AncestorEvent;

import javax.swing.event.AncestorListener;

import javax.xml.soap.Text;

public class MAINFRAME extends JFrame {

    private Container cp;

    private JLabel jlb1 = new JLabel("歡樂吹氣球");

    private JLabel jlb2 = new JLabel("請輸入使用者");

    private JLabel jlb3 = new JLabel();

    private JLabel jlb4 = new JLabel();

    private JLabel jlb5 = new JLabel("規則");

    private JLabel jlb6 = new JLabel("計分");

    private JLabel jlb7 = new JLabel("請先輸入使用者名稱,進入遊戲畫面後,");

    private JLabel jlb8 = new JLabel("按下start後開始遊戲吹氣球,");

    private JLabel jlb9 = new JLabel("如欲停止吹氣請方開start終止吹氣!!");

    private JLabel jlb10 = new JLabel("當吹氣超過電腦亂數值,將積分扣回,");

    private JLabel jlb11 = new JLabel("反之,如果未達電腦亂數值則酌量給分,");

    private JLabel jlb12 = new JLabel("當吹氣值與亂數值相同時則給滿分10分!" );

    private JTextField jlf = new JTextField();

    private JButton jbtnENTER = new JButton("ENTER ");

    private JButton jbtnEXIT = new JButton("EXIT");

    private ImageIcon icon1 = new ImageIcon("1.png");

    private ImageIcon icon2 = new ImageIcon("2.png");



    public MAINFRAME() {

        init();

    }

    private void init() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);

        this.setResizable(false);

        this.setLocation(100, 50);

        this.setSize(1800, 1000);

        cp = this.getContentPane();

        jlb1.setBounds(800,50,400,200);

        jlb1.setFont(new Font(null,Font.BOLD,70));

        jlb2.setBounds(850,200,400,200);

        jlb2.setFont(new Font(null,Font.BOLD,40));

        jlb3.setIcon(icon1);

        jlb3.setBounds(200,200,800,1000);

        jlb4.setIcon(icon2);

        jlb4.setBounds(1200,200,800,1000);

        jlb5.setBounds(400,5,400,200);

        jlb5.setFont(new Font(null,Font.BOLD,60));

        jlb6.setBounds(1400,5,400,200);

        jlb6.setFont(new Font(null,Font.BOLD,60));

        jlb7.setBounds(200,90,600,200);

        jlb7.setFont(new Font(null,Font.BOLD,30));

        jlb8.setBounds(200,120,600,200);

        jlb8.setFont(new Font(null,Font.BOLD,30));

        jlb9.setBounds(200,150,600,200);

        jlb9.setFont(new Font(null,Font.BOLD,30));

        jlb10.setBounds(1200,90,600,200);

        jlb10.setFont(new Font(null,Font.BOLD,30));

        jlb11.setBounds(1200,120,600,200);

        jlb11.setFont(new Font(null,Font.BOLD,30));

        jlb12.setBounds(1200,150,600,200);

        jlb12.setFont(new Font(null,Font.BOLD,30));

        jbtnEXIT.setBounds(850, 800, 200, 100);

        jbtnEXIT.setFont(new Font(null,Font.BOLD,25));

        jbtnENTER.setBounds(850,600,200,100);

        jbtnENTER.setFont(new Font(null,Font.BOLD,25));

        jlf.setBounds(850,400,200,100);

        jlf.setFont(new Font(null,Font.BOLD,30));

        this.add(jlb1);

        this.add(jlb2);

        this.add(jlb3);

        this.add(jlb4);

        this.add(jlb5);

        this.add(jlb6);

        this.add(jlb7);

        this.add(jlb8);

        this.add(jlb9);

        this.add(jlb10);

        this.add(jlb11);

        this.add(jlb12);

        this.add(jbtnEXIT);

        this.add(jbtnENTER);

        this.add(jlf);

        jbtnENTER.addMouseListener(new MouseAdapter() {



            @Override



            public void mousePressed(MouseEvent e) {

                JOptionPane.showMessageDialog(null,"遊戲開始");

                MAINFRAME2 frm = new MAINFRAME2(jlf.getText());

                frm.setVisible(true);

                MAINFRAME.this.setVisible(false);

            }



        });



        jbtnEXIT.addActionListener(new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {



                System.exit(0);

            }

        });

        jlf.addActionListener(new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {

                jlf.getText();

            }

        });

    }

}