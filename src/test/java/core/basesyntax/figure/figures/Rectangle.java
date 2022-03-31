package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Rectangle extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "RECTANGLE";
    private int firstLeg;
    private int secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Rectangle, Color: " + color + ", First Leg: " + firstLeg + ", Second Leg: " + secondLeg + "Area: " + getArea() + ".");
    }

    @Override
    public void setRandomParameter() {
        this.firstLeg = random.nextInt();
        this.secondLeg = random.nextInt();
        color = new ColorSupplier().getRandomColor();
        name = NAME_DEFAULT;
    }
}
