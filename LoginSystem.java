
import java.awt.Color;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginSystem extends JFrame{


    public LoginSystem() {

        // This should help you get started //

        // Problem: SubRon Image not displaying //

        ImageIcon image = new ImageIcon(Objects.requireNonNull(getClass().getResource("/SUbRon.png")));

        JLabel label = new JLabel();
        label.setIcon(image);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(800, 800);
        this.getContentPane().setBackground(new Color(0, 0, 0));  // Already made the background black //
        this.setVisible(true);
        this.add(label);

        /* Subol's job */

        // Subol make the username and password textfield and make the image display on screen //

        // Start coding here for username and password textfield //






    }




    
   





     /* Ronak's Job  */

    // login button
    // sign up button 
    // Database to connect the username and password for the login system

    private void setBackground(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
