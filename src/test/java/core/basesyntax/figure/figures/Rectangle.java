package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;

import java.sql.PseudoColumnUsage;
import java.util.Random;

public class Rectangle extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "RECTANGLE";
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
/*
    public void randomRectangle() {
        setName(NAME_DEFAULT);
        setColor(new ColorSupplier().getRandomColor());
        this.firstLeg = random.nextInt();
        this.secondLeg = random.nextInt();
    }
*/
    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + NAME_DEFAULT + ", Color: " + getColor() + ", First Leg: " + firstLeg + ", Second Leg: " + secondLeg + "Area: " + getArea() + ".");
    }

}
