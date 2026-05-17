package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Print;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double base;
    private double top;
    private double height;

    public IsoscelesTrapezoid(String color, int base, int height, int top) {
        super(color);
        this.base = base;
        this.height = height;
        this.top = top;
    }

    @Override
    public double calculateArea() {
        return (this.base + this.top) / 2 * this.height;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculateArea()
                + "base: " + base
                + "units, top: " + top
                + "units, height: " + height
                + " sq. units, color: " + getColor());
    }
}
