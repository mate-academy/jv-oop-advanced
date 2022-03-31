package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.interfaces.Area;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure implements Area {
    private final Random random = new Random();
    private static final int FIRST_BASE_DEFAULT = 10;
    private static final int SECOND_BASE_DEFAULT = 10;
    private static final double HEIGHT_DEFAULT = 10;
    private static final String COLOR_DEFAULT = "DefaultColorIsoscelesTrapezoid";
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

    @Override
    public void setDefaultParameter() {
        this.firstBase = FIRST_BASE_DEFAULT;
        this.secondBase = SECOND_BASE_DEFAULT;
        this.height = HEIGHT_DEFAULT;
        color = COLOR_DEFAULT;
        name = NAME_DEFAULT;
    }
}
