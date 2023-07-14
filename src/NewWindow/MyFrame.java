package NewWindow;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame.DO_NOTHING_ON_CLOSE — Ignore the click or 0.
                                                            //JFrame.HIDE_ON_CLOSE — Hide the frame, but keep the application running or 1.
                                                            //JFrame.DISPOSE_ON_CLOSE — Dispose of the frame object, but keep the application running or 2.
                                                            //JFrame.EXIT_ON_CLOSE — Exit the application or 3.
        //this.setSize(100, 100);// set the window fisible
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // set the window full screen without start menu
        this.setVisible(true); // set the window fisible
        //this.
    }
}
