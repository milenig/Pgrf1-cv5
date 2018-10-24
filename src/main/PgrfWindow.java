package main;

import javax.swing.*;


public class PgrfWindow extends JFrame {

    private final Raster raster;

    public PgrfWindow() {

        // bez tohoto nastavení se okno zavře, ale aplikace stále běží na pozadí
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 600); // velikost okna
        setLocationRelativeTo(null);// vycentrovat okno
        setTitle("PGRF1 cvičení"); // titulek okna


        // inicializace plátna, do kterého budeme kreslit img
        raster = new Raster();

        add(raster);  //vlozit platno do okna
    }

    public Raster getRaster() {
        return raster;
    }
}
