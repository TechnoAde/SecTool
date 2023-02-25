package textmanager.passwordutils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Logger;

public class PasswordGenerator extends JFrame {

    protected static final Random random = new Random(System.nanoTime());
    protected static final Logger logger = Logger.getLogger("Home");
    protected JButton button1;
    protected JTextField textField1;
    protected JLabel textfield;
    protected JPanel mainPanel;
    protected JFormattedTextField formattedTextField1;


    public PasswordGenerator() {
        setContentPane(mainPanel);
        setTitle("Password generator");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lunghezzapassword = textField1.getText();
                char[] passwordfinale = "".toCharArray();

                if(Integer.parseInt(lunghezzapassword)<1){formattedTextField1.removeAll(); formattedTextField1.setText("Non puoi generare una password più corta di un carattere");}

                final long startTime = System.nanoTime();

                passwordfinale = Generate.charsg(random, Integer.parseInt(lunghezzapassword));

                //Test optimization
                final long endTime = System.nanoTime();
                final long duration = (endTime - startTime);

                logger.info(String.valueOf(duration));
                formattedTextField1.removeAll();
                formattedTextField1.setText(String.valueOf(passwordfinale));
            }
        });
    }

}
