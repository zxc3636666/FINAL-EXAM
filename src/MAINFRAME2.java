import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MAINFRAME2 extends JFrame {

    private JButton jbt = new JButton("START");

    private JButton jbt2 = new JButton("RESET");

    private JButton jbt1 = new JButton("EXIT");

    private JLabel jlb1 = new JLabel();

    private JLabel jb1 = new JLabel( );

    private JLabel jlb = new JLabel("使用者" );

//    private JPanel jpn = new JPanel(new GridLayout(3,1,3,3));
//    private JPanel jpn2 = new JPanel(new GridLayout(2,1,3,3));

    private ImageIcon img1 = new ImageIcon("下載.jpg");

    private Timer t1;

    private Container cp;

    private  int count =0;

    public MAINFRAME2(){

        init();
    }
    private void init(){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setResizable(false);

        this.setBounds(0,0,800,600);

        cp = this.getContentPane();

        this.add(jbt);

        this.add(jbt2);

        this.add(jbt1);

        this.add(jb1);

        this.add(jlb);

        this.add(jlb1);

        jbt.setBounds(0,0,150,200);

        jbt.setFont(new Font(null,Font.BOLD,25));

        jbt2.setBounds(0,200,150,200);

        jbt2.setFont(new Font(null,Font.BOLD,25));

        jbt1.setBounds(0,375,150,200);

        jbt1.setFont(new Font(null,Font.BOLD,25));

        jb1.setBounds(450,200,50,50);

        jb1.setIcon(img1);

        jlb.setBounds(450,20,100,50);

        jlb.setFont(new Font(null,Font.BOLD,25));

        jlb1.setBounds(450,20,100,50);

//        jpn.add(jbt);
//        jpn.add(jbt2);
//        jpn.add(jbt1);
//        jpn2.add(jlb);
//        jpn2.add(jb1);
//        cp.add(jpn,BorderLayout.WEST);
//        cp.add(jpn2,BorderLayout.CENTER);
//        jpn.setPreferredSize(new Dimension(150,800));
//        jpn2.setPreferredSize(new Dimension(300,800));

        t1 = new Timer(100, new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {

               }

           });

        jbt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                count = count + 1;

                MAINFRAME2.this.setTitle(Integer.toString(count));

                t1.start();

                if (count<25){

                    t1.stop();

                }

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

                MAINFRAME2.this.setTitle(Integer.toString(count));

            }

        });

    }
}
