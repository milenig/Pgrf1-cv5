package main.main;

import main.view.PgrfWindow;
import main.controller.PgrfController;

import javax.swing.*;

public class App {
    public static void main(String[] args) { //main class
        SwingUtilities.invokeLater(()->{
            PgrfWindow window = new PgrfWindow();
            //controller
            new PgrfController(window.getRaster());
            window.setVisible(true);
        });
        // https://www.google.com/search?q=SwingUtilities.invokeLater
        // https://www.javamex.com/tutorials/threads/invokelater.shtml
        // https://www.google.com/search?q=java+double+colon
    }
}
