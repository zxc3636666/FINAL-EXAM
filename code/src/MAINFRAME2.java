import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.util.Random;

public class MAINFRAME2 extends JFrame{

    private JButton jbt = new JButton("START");



    private JButton jbtS = new JButton("STOP");



    private JButton jbt2 = new JButton("RESET");



    private JButton jbt1 = new JButton("EXIT");



    private JLabel jlb1 = new JLabel();



    private JLabel jb1 = new JLabel( );//圖片



    private JLabel jlb = new JLabel();

    private JLabel jlb2 = new JLabel();



    private Random rand = new Random();

    private int x;





    private ImageIcon img1 = new ImageIcon("3-1.png");

    private ImageIcon img2 = new ImageIcon("3-2.png");

    private ImageIcon img3 = new ImageIcon("3-3.png");

    private ImageIcon img4 = new ImageIcon("3-4.png");

    private ImageIcon img5 = new ImageIcon("3-5.png");

    private ImageIcon img6 = new ImageIcon("3-6.png");

    private ImageIcon img7 = new ImageIcon("3-7.png");

    private ImageIcon img8 = new ImageIcon("3-8.png");

    private ImageIcon img9 = new ImageIcon("3-9.png");

    private ImageIcon img = new ImageIcon("3.png");

    private ImageIcon img0 = new ImageIcon("5.png");



    private Timer t1;



    private Container cp;



    private  int count =0;





    private String userName;



    public MAINFRAME2(String name){



        userName = name;



        init();

    }

    private void init(){





        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        this.setResizable(false);



        this.setBounds(0,0,800,600);



        cp = this.getContentPane();



        jlb.setText(userName);



        this.add(jbt);



        this.add(jbtS);



        this.add(jbt2);



        this.add(jbt1);



        this.add(jb1);



        this.add(jlb);



        this.add(jlb1);

        this.add(jlb2);



        jbt.setBounds(0,0,150,150);



        jbt.setFont(new Font(null,Font.BOLD,25));



        jbtS.setBounds(0,150,150,150);



        jbtS.setFont(new Font(null,Font.BOLD,25));



        jbt2.setBounds(0,280,150,150);



        jbt2.setFont(new Font(null,Font.BOLD,25));



        jbt1.setBounds(0,420,150,150);



        jbt1.setFont(new Font(null,Font.BOLD,25));



        jb1.setBounds(300,150,339,339);



        jb1.setIcon(img1);



        jlb.setBounds(450,20,100,50);



        jlb.setFont(new Font(null,Font.BOLD,25));



        jlb1.setBounds(200,20,100,50);



        jlb1.setFont(new Font(null,Font.BOLD,25));







        t1 = new Timer(250, new AbstractAction() {



            @Override



            public void actionPerformed(ActionEvent e) {

                count = (int) count + 1 ;

                jlb1.setText("數值:"+Integer.toString(count));

                if (count> x) {

                    if (count == 5) {

                        jb1.setIcon(img);

                    } else if (count == 10) {

                        jb1.setIcon(img2);

                    } else if (count == 15) {

                        jb1.setIcon(img3);

                    } else if (count == 20) {

                        jb1.setIcon(img4);

                    } else if (count == 25) {

                        jb1.setIcon(img8);

                    } else if (count == 30) {

                        jb1.setIcon(img5);

                    } else if (count == 35) {

                        jb1.setIcon(img6);

                    } else if (count == 40) {

                        jb1.setIcon(img7);

                    } else if (count == 45) {

                        jb1.setIcon(img9);

                    } else if (count == 50) {

                        jb1.setIcon(img0);

                    }

                    if (count == 50) {

                        t1.stop();

                    } else {

                        jb1.setIcon(img0);

                        t1.stop();

                        JOptionPane.showMessageDialog(null, "GAME OVER爆裂");

                    }

                }

            }

        });



        jbt.addMouseListener(new MouseAdapter() {

            @Override

            public void mousePressed(MouseEvent e) {

                t1.start();

                int[] num=new int[50];

                int cnt=0,flag=0;

                while (cnt < 1){

                    x=rand.nextInt(50)+1;

                    for (int i=0; i<cnt; i++)

                        if (x==num[i]){

                            flag++;

                            break;

                        }

                    if (flag==0 ){

                        num[cnt]=x;

                        cnt++;

                    } else

                        flag=0;

                }

                for (int i=0; i<1; i++) {

                    System.out.println(x);

                }

            }

        });

        jbtS.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {



                t1.stop();

                JOptionPane.showMessageDialog(null,"NICE 未爆裂");



            }

        });

        jbt1.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }

        });

        jbt2.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                jb1.setIcon(img1);

                jlb1.setText("數值:"+Integer.toString(count=0));

            }

        });

    }

}