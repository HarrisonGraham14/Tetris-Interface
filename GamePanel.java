import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    private TilePanel tilePanel = new TilePanel();
    private InfoPanel infoPanel = new InfoPanel();

    GamePanel() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(tilePanel);
        add(infoPanel);
    }
}
