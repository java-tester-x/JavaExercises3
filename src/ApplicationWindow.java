package src;

import java.awt.*;
import java.awt.event.*;

import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory;


public class ApplicationWindow extends JFrame {

    private String      imagPath  = "resources/images/";
    
    // Name-constants to define the various dimensions
    private static final int WINDOW_WIDTH  = 640;
    private static final int WINDOW_HEIGHT = 480;

    private Container          mainContentPane;
    private GroupLayout        layout;


    public ApplicationWindow(String title)
    {
        mainContentPane = this.getContentPane();

        // Content-pane sets layout
        // cp.setLayout(new ....Layout());        
        layout = new GroupLayout(mainContentPane);
        mainContentPane.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        // Allocate the UI components
        initComponents();   

        // Content-pane adds components
        // mainContentPane.add(scroller, BorderLayout.CENTER);   
        // mainContentPane.add(inputPanel, BorderLayout.NORTH);   

        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);       
        setTitle(title);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);        
    }

    /**
     * [initComponents description]
     */
    private void initComponents()
    {
        // 
    }
}