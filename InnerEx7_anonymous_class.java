import java.awt.*;
import java.awt.event.*;

public class InnerEx7_anonymous_class {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}
class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        System.out.println("ActionEvent occured !!!");
    }
}
