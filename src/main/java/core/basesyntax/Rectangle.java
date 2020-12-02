package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements Area, ColorCreator {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int showLength() {
        return length;
    }

    @Override
    public double countArea() {
        return height * length;
    }

    @Override
    public Color getColor() {
        int randomInteger = new Random().nextInt(Color.values().length);
        return Color.values()[randomInteger];
    }

    @Override
    public String onScreen() {
        return "Figure: rectangle, area: " + countArea() + " sq. units, length "
                + showLength() + ", color: " + getColor().name().toLowerCase();
    }
}
