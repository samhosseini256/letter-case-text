import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setSize(300,240);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);

        JButton button = new JButton("Set");

        JComboBox letters = new JComboBox();

        letters.addItem("Camel case");
        letters.addItem("Pascal Case");
        letters.addItem("Snake case");
        letters.addItem("Kebab case");
        letters.addItem("Title case");
        letters.addItem("All uppercase");
        letters.addItem("All lowercase");
        letters.addItem("Sentence case");
        letters.addItem("Start case");
        letters.addItem("Studly caps");

        JTextPane puteText = new JTextPane();
        JTextPane letterText = new JTextPane();
        puteText.setBackground(Color.LIGHT_GRAY);
        letterText.setBackground(Color.LIGHT_GRAY);

        window.add(button);
        window.add(letters);
        window.add(puteText);
        window.add(letterText);

        letters.setBounds(10,20,120,20);
        button.setBounds(150,20,120,20);
        puteText.setBounds(10,50,120,120);
        letterText.setBounds(150,50,120,120);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (letters.getSelectedItem().toString()){
                    case "Camel case":
                        letterText.setText(LetterCase.camelCase(puteText.getText()));
                        break;
                    case "Pascal Case":
                        letterText.setText(LetterCase.pascalCase(puteText.getText()));
                        break;
                    case "Snake case":
                        letterText.setText(LetterCase.snakeCase(puteText.getText()));
                        break;
                    case "Kebab case":
                        letterText.setText(LetterCase.kebabCase(puteText.getText()));
                        break;
                    case "Title case":
                        letterText.setText(LetterCase.titleCase(puteText.getText()));
                        break;
                    case "All uppercase":
                        letterText.setText(LetterCase.allUppercase(puteText.getText()));
                        break;
                    case "All lowercase":
                        letterText.setText(LetterCase.allLowercase(puteText.getText()));
                        break;
                    case "Sentence case":
                        letterText.setText(LetterCase.sentenceCase(puteText.getText()));
                        break;
                    case "Start case":
                        letterText.setText(LetterCase.startCase(puteText.getText()));
                        break;
                    case "Studly caps":
                        letterText.setText(LetterCase.studlyCaps(puteText.getText()));
                        break;
                    default:
                        JOptionPane.showMessageDialog(window,"Do it!");
                }
            }
        });
    }
}