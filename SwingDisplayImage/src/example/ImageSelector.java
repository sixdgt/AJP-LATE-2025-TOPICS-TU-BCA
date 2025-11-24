package example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ImageSelector extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel imageLabel;

    public ImageSelector() {
        setTitle("Image Selector");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // JLabel to Display Image
        imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Button to Choose Image
        JButton chooseButton = new JButton("Select Image");
        chooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseImage();
            }
        });
        add(chooseButton, BorderLayout.SOUTH);
    }

    private void chooseImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose an Image");

        // Filter for image files
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(
            new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "gif")
        );

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

            // Resize image to fit label
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);

            imageLabel.setIcon(icon);
            imageLabel.setText(""); // remove text
        }
    }

    public static void main(String[] args) {
            new ImageSelector().setVisible(true);
    }
}
