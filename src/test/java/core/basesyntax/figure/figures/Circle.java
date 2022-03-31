package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Circle extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "CIRCLE";
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }
/*
    public void () {
        setName(NAME_DEFAULT);
        setColor(new ColorSupplier().getRandomColor());
        this.radius = random.nextInt();
    }

    public void defaultCircle(String color, int radius) {
        setName(NAME_DEFAULT);
        setColor(color);
        this.radius = radius;
    }
*/
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + NAME_DEFAULT + ", Color: " + getColor() + ", Radius: " + radius + ", Area: " + getArea() + ".");
    }
}
