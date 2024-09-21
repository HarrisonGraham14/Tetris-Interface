import javax.swing.*;

public class ServerFrame extends JFrame {
    private JPanel container = new JPanel();
    private GamePanel gamePanelLeft = new GamePanel();
    private GamePanel gamePanelRight = new GamePanel();

    ServerFrame () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Tetris");

        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        container.add(gamePanelLeft);
        container.add(gamePanelRight);

        add(container);
        pack();
        setVisible(true);
    }

    public void paint() {

    }
}
