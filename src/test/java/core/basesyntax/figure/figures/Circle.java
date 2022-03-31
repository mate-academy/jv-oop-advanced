package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Circle extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "CIRCLE";
    private int radius;

    public void setCircle(String color, int radius) {
        super.color = color;
        this.radius = radius;
     }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: CIRCLE, Color: " + color + ", Radius: " + radius + ", Area: " + getArea() + ".");
    }

    @Override
    public void setRandomParameter() {
        this.radius = random.nextInt();
        color = new ColorSupplier().getRandomColor();
        name = NAME_DEFAULT;
    }
}
