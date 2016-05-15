package forca;

import javax.swing.JFrame;

public class ContainerDeJanelas extends JFrame {

	private static final long serialVersionUID = 1L;

	public ContainerDeJanelas() {

        add(new Forca());
        setTitle("Forca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ContainerDeJanelas();
    }
}
