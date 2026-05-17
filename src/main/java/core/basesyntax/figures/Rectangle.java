package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Print;

public class Rectangle extends Figure implements AreaCalculator {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculateArea()
                + " sq. units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, color: " + getColor());
    }
}
