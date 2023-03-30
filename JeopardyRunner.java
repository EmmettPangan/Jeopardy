import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class JeopardyRunner extends JFrame implements ActionListener
{
    private JLabel cat1, cat2, cat3, cat4, cat5, cat6;
    private JButton c1q1, c1q2, c1q3, c1q4, c1q5;
    private JButton c2q1, c2q2, c2q3, c2q4, c2q5;
    private JButton c3q1, c3q2, c3q3, c3q4, c3q5;
    private JButton c4q1, c4q2, c4q3, c4q4, c4q5;
    private JButton c5q1, c5q2, c5q3, c5q4, c5q5;
    private JButton c6q1, c6q2, c6q3, c6q4, c6q5;
    private JButton[][] buttons;
    private JLabel[] categories;
    private int row, col;
    JeopardyQuestions qanda;
    
    public JeopardyRunner() 
    {
        setUIFont(new javax.swing.plaf.FontUIResource("Palatino Linotype", Font.PLAIN, 50));
        qanda = new JeopardyQuestions();
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        cat1 = new JLabel(qanda.getCategory(0));
        cat1.setBackground(new Color(6, 12, 233));
        cat1.setOpaque(true);
        cat1.setHorizontalAlignment(SwingConstants.CENTER);
        cat1.setForeground(Color.white);
        cat2 = new JLabel(qanda.getCategory(1));
        cat2.setBackground(new Color(6, 12, 233));
        cat2.setOpaque(true);
        cat2.setForeground(Color.white);
        cat2.setHorizontalAlignment(SwingConstants.CENTER);
        cat3 = new JLabel(qanda.getCategory(2));
        cat3.setBackground(new Color(6, 12, 233));
        cat3.setOpaque(true);
        cat3.setForeground(Color.white);
        cat3.setHorizontalAlignment(SwingConstants.CENTER);
        cat4 = new JLabel(qanda.getCategory(3));
        cat4.setBackground(new Color(6, 12, 233));
        cat4.setOpaque(true);
        cat4.setForeground(Color.white);
        cat4.setHorizontalAlignment(SwingConstants.CENTER);
        cat5 = new JLabel(qanda.getCategory(4));
        cat5.setBackground(new Color(6, 12, 233));
        cat5.setOpaque(true);
        cat5.setForeground(Color.white);
        cat5.setHorizontalAlignment(SwingConstants.CENTER);
        cat6 = new JLabel(qanda.getCategory(5));
        cat6.setBackground(new Color(6, 12, 233));
        cat6.setOpaque(true);
        cat6.setForeground(Color.white);
        cat6.setHorizontalAlignment(SwingConstants.CENTER);
        c1q1 = new JButton("200");
        c1q1.setBackground(new Color(6, 12, 233));
        c1q1.setForeground(Color.white);
        c1q2 = new JButton("400");
        c1q2.setForeground(Color.white);
        c1q2.setBackground(new Color(6, 12, 233));
        c1q3 = new JButton("600");
        c1q3.setForeground(Color.white);
        c1q3.setBackground(new Color(6, 12, 233));
        c1q4 = new JButton("800");
        c1q4.setBackground(new Color(6, 12, 233));
        c1q4.setForeground(Color.white);
        c1q5 = new JButton("1000");
        c1q5.setBackground(new Color(6, 12, 233));
        c1q5.setForeground(Color.white);
        c2q1 = new JButton("200");
        c2q1.setBackground(new Color(6, 12, 233));
        c2q1.setForeground(Color.white);
        c2q2 = new JButton("400");
        c2q2.setBackground(new Color(6, 12, 233));
        c2q2.setForeground(Color.white);
        c2q3 = new JButton("600");
        c2q3.setBackground(new Color(6, 12, 233));
        c2q3.setForeground(Color.white);
        c2q4 = new JButton("800");
        c2q4.setBackground(new Color(6, 12, 233));
        c2q4.setForeground(Color.white);
        c2q5 = new JButton("1000");
        c2q5.setBackground(new Color(6, 12, 233));
        c2q5.setForeground(Color.white);
        c3q1 = new JButton("200");
        c3q1.setBackground(new Color(6, 12, 233));
        c3q1.setForeground(Color.white);
        c3q2 = new JButton("400");
        c3q2.setBackground(new Color(6, 12, 233));
        c3q2.setForeground(Color.white);
        c3q3 = new JButton("600");
        c3q3.setBackground(new Color(6, 12, 233));
        c3q3.setForeground(Color.white);
        c3q4 = new JButton("800");
        c3q4.setBackground(new Color(6, 12, 233));
        c3q4.setForeground(Color.white);
        c3q5 = new JButton("1000");
        c3q5.setBackground(new Color(6, 12, 233));
        c3q5.setForeground(Color.white);
        c4q1 = new JButton("200");
        c4q1.setBackground(new Color(6, 12, 233));
        c4q1.setForeground(Color.white);
        c4q2 = new JButton("400");
        c4q2.setBackground(new Color(6, 12, 233));
        c4q2.setForeground(Color.white);
        c4q3 = new JButton("600");
        c4q3.setBackground(new Color(6, 12, 233));
        c4q3.setForeground(Color.white);
        c4q4 = new JButton("800");
        c4q4.setBackground(new Color(6, 12, 233));
        c4q4.setForeground(Color.white);
        c4q5 = new JButton("1000");
        c4q5.setBackground(new Color(6, 12, 233));
        c4q5.setForeground(Color.white);
        c5q1 = new JButton("200");
        c5q1.setBackground(new Color(6, 12, 233));
        c5q1.setForeground(Color.white);
        c5q2 = new JButton("400");
        c5q2.setBackground(new Color(6, 12, 233));
        c5q2.setForeground(Color.white);
        c5q3 = new JButton("600");
        c5q3.setBackground(new Color(6, 12, 233));
        c5q3.setForeground(Color.white);
        c5q4 = new JButton("800");
        c5q4.setBackground(new Color(6, 12, 233));
        c5q4.setForeground(Color.white);
        c5q5 = new JButton("1000");
        c5q5.setBackground(new Color(6, 12, 233));
        c5q5.setForeground(Color.white);
        c6q1 = new JButton("200");
        c6q1.setBackground(new Color(6, 12, 233));
        c6q1.setForeground(Color.white);
        c6q2 = new JButton("400");
        c6q2.setBackground(new Color(6, 12, 233));
        c6q2.setForeground(Color.white);
        c6q3 = new JButton("600");
        c6q3.setBackground(new Color(6, 12, 233));
        c6q3.setForeground(Color.white);
        c6q4 = new JButton("800");
        c6q4.setBackground(new Color(6, 12, 233));
        c6q4.setForeground(Color.white);
        c6q5 = new JButton("1000");
        c6q5.setBackground(new Color(6, 12, 233));
        c6q5.setForeground(Color.white);
        add(cat1);
        add(cat2);
        add(cat3);
        add(cat4);
        add(cat5);
        add(cat6);
        add(c1q1);
        add(c2q1);
        add(c3q1);
        add(c4q1);
        add(c5q1);
        add(c6q1);
        add(c1q2);
        add(c2q2);
        add(c3q2);
        add(c4q2);
        add(c5q2);
        add(c6q2);
        add(c1q3);
        add(c2q3);
        add(c3q3);
        add(c4q3);
        add(c5q3);
        add(c6q3);
        add(c1q4);
        add(c2q4);
        add(c3q4);
        add(c4q4);
        add(c5q4);
        add(c6q4);
        add(c1q5);
        add(c2q5);
        add(c3q5);
        add(c4q5);
        add(c5q5);
        add(c6q5);
        setLayout(new GridLayout(6, 6, 5, 5));
        setVisible(true);
        buttons = new JButton[5][6];
        buttons[0][0] = c1q1;
        buttons[0][1] = c2q1;
        buttons[0][2] = c3q1;
        buttons[0][3] = c4q1;
        buttons[0][4] = c5q1;
        buttons[0][5] = c6q1;
        buttons[1][0] = c1q2;
        buttons[1][1] = c2q2;
        buttons[1][2] = c3q2;
        buttons[1][3] = c4q2;
        buttons[1][4] = c5q2;
        buttons[1][5] = c6q2;
        buttons[2][0] = c1q3;
        buttons[2][1] = c2q3;
        buttons[2][2] = c3q3;
        buttons[2][3] = c4q3;
        buttons[2][4] = c5q3;
        buttons[2][5] = c6q3;
        buttons[3][0] = c1q4;
        buttons[3][1] = c2q4;
        buttons[3][2] = c3q4;
        buttons[3][3] = c4q4;
        buttons[3][4] = c5q4;
        buttons[3][5] = c6q4;
        buttons[4][0] = c1q5;
        buttons[4][1] = c2q5;
        buttons[4][2] = c3q5;
        buttons[4][3] = c4q5;
        buttons[4][4] = c5q5;
        buttons[4][5] = c6q5;
        c1q1.addActionListener(this);
        c1q2.addActionListener(this);
        c1q3.addActionListener(this);
        c1q4.addActionListener(this);
        c1q5.addActionListener(this);
        c2q1.addActionListener(this);
        c2q2.addActionListener(this);
        c2q3.addActionListener(this);
        c2q4.addActionListener(this);
        c2q5.addActionListener(this);
        c3q1.addActionListener(this);
        c3q2.addActionListener(this);
        c3q3.addActionListener(this);
        c3q4.addActionListener(this);
        c3q5.addActionListener(this);
        c4q1.addActionListener(this);
        c4q2.addActionListener(this);
        c4q3.addActionListener(this);
        c4q4.addActionListener(this);
        c4q5.addActionListener(this);
        c5q1.addActionListener(this);
        c5q2.addActionListener(this);
        c5q3.addActionListener(this);
        c5q4.addActionListener(this);
        c5q5.addActionListener(this);
        c6q1.addActionListener(this);
        c6q2.addActionListener(this);
        c6q3.addActionListener(this);
        c6q4.addActionListener(this);
        c6q5.addActionListener(this);
        categories = new JLabel[6];
        categories[0] = cat1;
        categories[1] = cat2;
        categories[2] = cat3;
        categories[3] = cat4;
        categories[4] = cat5;
        categories[5] = cat6;
        int finalFontSize = Integer.MAX_VALUE;
        for (int i = 0; i < categories.length; i++){
                categories[i].setVerticalAlignment(JLabel.CENTER);
                Font labelFont = categories[i].getFont();
                String labelText = categories[i].getText();

                int stringWidth = categories[i].getFontMetrics(labelFont).stringWidth(labelText);
                int componentWidth = categories[i].getWidth();

                // Find out how much the font can grow in width.
                double widthRatio = (double)componentWidth / (double)stringWidth;
                int newFontSize = (int)(labelFont.getSize() * widthRatio);
                int componentHeight = categories[i].getHeight();

                // Pick a new font size so it will not be larger than the height of label.
                int fontSizeToUse = Math.min(newFontSize, componentHeight);

                // Set the label's font size to the newly determined size.
                if (fontSizeToUse < finalFontSize)
                    finalFontSize = fontSizeToUse;
            }
        for (int i = 0; i < categories.length; i++) {
            categories[i].setFont(new Font("Palatino Linotype", Font.PLAIN, finalFontSize));
        }
        for (int r = 0; r < buttons.length; r++)
            for (int c = 0; c < buttons[r].length; c++)
                buttons[r][c].setVerticalAlignment(JButton.CENTER);
    }
    public static void main(String[] args) 
    {
        new JeopardyRunner();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JFrame window = new JFrame();
        window.setLayout(new BorderLayout());
        window.setExtendedState(Frame.MAXIMIZED_BOTH);
        window.getContentPane().setBackground(new Color(6, 12, 233));
        window.setVisible(true);
        for (int r = 0; r < buttons.length; r++)
            for (int c = 0; c < buttons[r].length; c++)
                if (buttons[r][c] == e.getSource())
                {
                    row = r;
                    col = c;
                }
        buttons[row][col].setVisible(false);
        JLabel question = new JLabel(qanda.getQandA(row, col).substring(0, qanda.getQandA(row, col).indexOf("---")));
        question.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        question.setText("<html>" + qanda.getQandA(row, col).substring(0, qanda.getQandA(row, col).indexOf("---")).replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");
        window.add(question, BorderLayout.CENTER);
        question.setForeground(Color.white);
        question.setHorizontalAlignment(SwingConstants.CENTER);
        JButton answer = new JButton("Show Answer");
        answer.addActionListener((ActionEvent x1) -> {
            JLabel visibleAnswer = new JLabel(qanda.getQandA(row, col).substring(qanda.getQandA(row, col).indexOf("---") + 3));
            window.remove(answer);
            window.add(visibleAnswer, BorderLayout.SOUTH);
            visibleAnswer.setForeground(Color.white);
            visibleAnswer.setOpaque(true);
            visibleAnswer.setBackground(new Color(6, 12, 233));
            visibleAnswer.setHorizontalAlignment(SwingConstants.CENTER);
            window.revalidate();
        });
        answer.setBackground(new Color(6, 12, 233));
        answer.setForeground(Color.white);
        window.add(answer, BorderLayout.SOUTH);
        window.add(new JLabel("                 "), BorderLayout.EAST);
        window.add(new JLabel("                 "), BorderLayout.WEST);
    }
    
    public static void setUIFont (javax.swing.plaf.FontUIResource f){
    java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get (key);
      if (value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put (key, f);
      }
    } 
}
