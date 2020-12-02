package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements Area, ColorCreator {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public Color getColor() {
        int randomInteger = new Random().nextInt(Color.values().length);
        return Color.values()[randomInteger];
    }

    @Override
    public String onScreen() {
        return "Figure: circle, area: " + countArea() + " sq. units, radius "
                + radius + ", color: " + getColor().name().toLowerCase();
    }
}
