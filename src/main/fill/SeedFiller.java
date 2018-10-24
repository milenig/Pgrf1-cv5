package main.fill;

import main.view.Raster;

public class SeedFiller implements Filler {

    private int x;
    private int y;
    private int color;
    private int backGround;

    private Raster raster;

    @Override
    public void setRaster(Raster raster) {
        this.raster = raster;
    }

    @Override
    public void fill() {
        seed(x, y);
    }

    public void init(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
        backGround = raster.getPixel(x, y);
    }

    // pozor na rekurzivní volání
    // nutné upravit parametr pro VM "-Xss100m"
    // https://stackoverflow.com/questions/4967885/jvm-option-xss-what-does-it-do-exactly
    private void seed(int ax, int ay) {
        if ((ax >= 0) && (ay >= 0) && (ax < Raster.WIDTH) && (ay < Raster.HEIGHT)) {
            if (backGround == raster.getPixel(ax, ay)) {
                raster.drawPixel(ax, ay, color);
                seed(ax + 1, ay);
                seed(ax - 1, ay);
                seed(ax, ay + 1);
                seed(ax, ay - 1);
            }
        }

    }
}