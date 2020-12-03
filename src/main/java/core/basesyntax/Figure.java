package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Figuring,Drawable {
    private Color color;
    private double area;

    public Color getColor() {
        return color;
    }

    public void setColor() {
        int randomGenaratedIndex = new Random().nextInt(Color.values().length);
        this.color = Color.values()[randomGenaratedIndex];
    }

    @Override
    public String draw() {
        return "Figure: ";
    }
}
