package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private final double side = new Random().nextInt(100);
    private final Color color = Color.values()[new Random().nextInt(10)];

    public double getSide() {
        return side;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.area()
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}
