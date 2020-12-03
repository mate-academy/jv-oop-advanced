package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure implements ColorCreator {
    private int width;
    private int height;

    public RightTriangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double countHypotenuse() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public double countArea() {
        return (double) width * height / 2;
    }

    @Override
    public Color getColor() {
        int randomInteger = new Random().nextInt(Color.values().length);
        return Color.values()[randomInteger];
    }

    @Override
    public String onScreen() {
        return "Figure: right triangle, area: " + countArea() + " sq. units, hypotenuse "
                + countHypotenuse() + ", color: " + getColor().name().toLowerCase();
    }
}
