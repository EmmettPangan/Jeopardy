import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JeopardyRunner extends JFrame implements ActionListener
{
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

        categories = new JLabel[6];
        for (int i = 0; i < categories.length; ++i) {
            JLabel category = new JLabel(qanda.getCategory(i));
            category.setBackground(new Color(6, 12, 233));
            category.setOpaque(true);
            category.setHorizontalAlignment(SwingConstants.CENTER);
            category.setForeground(Color.white);
            add(category);
            categories[i] = category;
        }

        buttons = new JButton[5][6];
        for (int i = 0; i < buttons.length; ++i) {
            for (int j = 0; j < buttons[i].length; ++j) {
                JButton button = new JButton(Integer.toString((i + 1) * 200));
                button.setBackground(new Color(6, 12, 233));
                button.setForeground(Color.white);
                button.setVerticalAlignment(SwingConstants.CENTER);
                add(button);
                button.addActionListener(this);
                buttons[i][j] = button;
            }
        }

        setLayout(new GridLayout(6, 6, 5, 5));
        resizeCategoryText();
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new JeopardyRunner();
    }

    public void resizeCategoryText() {
        int finalFontSize = Integer.MAX_VALUE;
        double componentWidth = (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 35) / 6;
        for (int i = 0; i < categories.length; i++) {
            Font labelFont = categories[i].getFont();
            String labelText = categories[i].getText();

            int stringWidth = categories[i].getFontMetrics(labelFont).stringWidth(labelText);

            // Find out how much the font should grow or shrink in width.
            double widthRatio = (double)componentWidth / (double)stringWidth;
            int newFontSize = (int)(labelFont.getSize() * widthRatio);

            // Set the label's font size to the newly determined size.
            if (newFontSize < finalFontSize) {
                finalFontSize = newFontSize;
            }
        }

        Font finalFont = new Font("Palatino Linotype", Font.PLAIN, finalFontSize);
        for (int i = 0; i < categories.length; i++) {
            categories[i].setFont(finalFont);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JFrame window = new JFrame();
        window.setLayout(new BorderLayout());
        window.setExtendedState(Frame.MAXIMIZED_BOTH);
        window.getContentPane().setBackground(new Color(6, 12, 233));
        window.setVisible(true);
        for (int r = 0; r < buttons.length; r++) {
            for (int c = 0; c < buttons[r].length; c++) {
                if (buttons[r][c] == e.getSource())
                {
                    row = r;
                    col = c;
                }
            }
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
    
    public static void setUIFont (javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get (key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put (key, f);
            }
        }
    } 
}
