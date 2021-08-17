package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class ColorSupplier {
    private Random rand;
    private float r;
    private float g;
    private float b;

    public ColorSupplier(Random rand, float r, float g, float b) {
        this.rand = rand;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public String getRandomColor() {
        r =rand.nextFloat();
        g = rand.nextFloat();
        b = rand.nextFloat();
        Color randColor = new Color(r, g, b);
        //int randColor = new ((int)Math.random() * 0x1000000);
        return String.valueOf(randColor);
    }

}
