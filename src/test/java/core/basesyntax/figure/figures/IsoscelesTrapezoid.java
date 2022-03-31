package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "ISOSCELES_TRAPEZOID";
    private int firstBase;
    private int secondBase;
    private double height;

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Isosceles Trapezoid, Color: " + color + ", First Base: " + firstBase + ", Second Base: " + secondBase + ", Heihgt: " + height + ", Area: " + getArea() + ".");
    }

    @Override
    public void setRandomParameter() {
        this.firstBase = random.nextInt();
        this.secondBase = random.nextInt();
        this.height = random.nextDouble();
        color = new ColorSupplier().getRandomColor();
        name = NAME_DEFAULT;
    }
}
