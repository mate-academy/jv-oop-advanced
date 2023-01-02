package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements Drawable {
    private double side = (double) new Random().nextInt(100);
    private Color color = Color.values()[new Random().nextInt(10)];

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.area() +
                " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}
