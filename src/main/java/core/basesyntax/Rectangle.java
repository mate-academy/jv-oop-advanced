package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements Drawable {
    private double firstSide = new Random().nextInt(100);
    private double secondSide = new Random().nextInt(100);
    private Color color = Color.values()[new Random().nextInt(10)];

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.area()
                + " sq.units, first side: " + getFirstSide() + " units, second side: "
                + getSecondSide() + " color: " + getColor());
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
