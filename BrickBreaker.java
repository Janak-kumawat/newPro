import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrickBreaker extends JPanel implements KeyListener, ActionListener {
    private Timer timer;
    private int paddleX = 310;
    private int ballX = 120, ballY = 350, ballXDir = -1, ballYDir = -2;
    private int score = 0;
    private boolean play = false;

    public BrickBreaker() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(8, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 700, 600);

        // Paddle
        g.setColor(Color.GREEN);
        g.fillRect(paddleX, 550, 100, 8);

        // Ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 20, 20);

        // Score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 550, 30);

        // Game Over
        if (ballY > 570) {
            play = false;
            timer.stop();
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over! Score: " + score, 200, 300);
        }

        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        if (play) {
            ballX += ballXDir;
            ballY += ballYDir;
            
            if (ballX < 0 || ballX > 680) ballXDir = -ballXDir;
            if (ballY < 0) ballYDir = -ballYDir;

            if (new Rectangle(ballX, ballY, 20, 20).intersects(new Rectangle(paddleX, 550, 100, 8))) {
                ballYDir = -ballYDir;
                score += 5;
            }
        }
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < 600) {
            play = true;
            paddleX += 30;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 10) {
            play = true;
            paddleX -= 30;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        BrickBreaker game = new BrickBreaker();
        frame.setBounds(10, 10, 700, 600);
        frame.setTitle("Brick Breaker");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
    }
}
