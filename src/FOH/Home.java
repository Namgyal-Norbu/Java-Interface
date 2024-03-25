package FOH;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home {
  private static JFrame frame;
  private static JPanel panel;

  public Home() {
    frame = new JFrame();
    panel = new JPanel();
  }

  public void start() throws IOException {
    panel.setBackground(new Color(42, 52, 54));
    panel.setBorder(BorderFactory.createEmptyBorder());
    panel.setLayout(null);

    loadButtons();

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("FOH Service Software");
    frame.setSize(950, 650);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  public void loadButtons() {
    JButton create = new JButton("Create Reservation");
    JButton view = new JButton("View Reservations");
    JButton serve = new JButton("Serve Table");

    create.setBounds(75, 275, 200, 150);
    view.setBounds(375, 275, 200, 150);
    serve.setBounds(675, 275, 200, 150);

    panel.add(create);
    panel.add(view);
    panel.add(serve);
  }
}
