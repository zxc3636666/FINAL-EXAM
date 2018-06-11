import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {
    private JButton jbt = new JButton("START");
    private JButton jbt2 = new JButton("RESET");
    private JButton jbt1 = new JButton("EXIT");
    private JLabel jb1 = new JLabel( );
    private JLabel jlb = new JLabel( "使用者");
    private JPanel jpn = new JPanel(new GridLayout(3,1,3,3));
    private JPanel jpn2 = new JPanel(new GridLayout(2,1,3,3));
    private ImageIcon img1 = new ImageIcon("下載.jpg");
    private Timer t1;
    private Container cp;
    private  int count =0;

    public Frame(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0,0,800,600);
        cp = this.getContentPane();
        jb1.setBounds(100,200,40,40);
        jb1.setIcon(img1);
        jpn.add(jbt);
        jpn.add(jbt2);
        jpn.add(jbt1);
        jpn2.add(jlb);
        jpn2.add(jb1);
        cp.add(jpn,BorderLayout.WEST);
        cp.add(jpn2,BorderLayout.CENTER);
        jpn.setPreferredSize(new Dimension(200,800));
        jpn2.setPreferredSize(new Dimension(300,800));

        t1 = new Timer(100, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

               }
           });
        jbt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                count = count + 1;
                Frame.this.setTitle(Integer.toString(count));
                t1.start();
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
                Frame.this.setTitle(Integer.toString(count));
            }
        });
    }
}
