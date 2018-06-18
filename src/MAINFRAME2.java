import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MAINFRAME2 extends JFrame {

    private JButton jbt = new JButton("START");

    private JButton jbtS = new JButton("STOP");

    private JButton jbt2 = new JButton("RESET");

    private JButton jbt1 = new JButton("EXIT");

    private JLabel jlb1 = new JLabel();

    private JLabel jb1 = new JLabel( );//圖片

    private JLabel jlb = new JLabel();
    private JLabel jlb2 = new JLabel();



    private ImageIcon img1 = new ImageIcon("3.png");

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

        jb1.setBounds(400,200,113,113);

        jb1.setIcon(img1);

        jlb.setBounds(450,20,100,50);

        jlb.setFont(new Font(null,Font.BOLD,25));

        jlb1.setBounds(200,20,100,50);

        jlb1.setFont(new Font(null,Font.BOLD,25));





        t1 = new Timer(500, new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                count = (int) count + 1 ;
                jlb1.setText("Time:"+Integer.toString(count));

               }

           });

        jbt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {


                t1.start();


            }
        });

        jbtS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.stop();
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

                count = 0;


            }

        });

    }
}
