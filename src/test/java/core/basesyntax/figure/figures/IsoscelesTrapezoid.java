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

    public IsoscelesTrapezoid(String name, String color, int firstBase, int secondBase, double height) {
        super(name, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }
/*
    public void randomIsoscelesTrapezoid() {
        setName(NAME_DEFAULT);
        setColor(new ColorSupplier().getRandomColor());
        this.firstBase = random.nextInt();
        this.secondBase = random.nextInt();
        this.height = random.nextDouble();
    }
*/
    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + NAME_DEFAULT + ", Color: " + getColor() + ", First Base: " + firstBase + ", Second Base: " + secondBase + ", Heihgt: " + height + ", Area: " + getArea() + ".");
    }

}
