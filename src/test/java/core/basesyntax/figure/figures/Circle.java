package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.interfaces.Area;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Circle extends Figure implements Area {
    private final Random random = new Random();
    private static final int RADIUS_DEFAULT = 10;
    private static final String COLOR_DEFAULT = "DefaultColorCircle";
    private static final String NAME_DEFAULT = "CIRCLE";
    private int radius;

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

    @Override
    public void setDefaultParameter() {
        this.radius = RADIUS_DEFAULT;
        color = COLOR_DEFAULT;
        name = NAME_DEFAULT;
    }
}

