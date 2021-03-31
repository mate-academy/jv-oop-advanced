package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.generator.ColorSupplier;

public class Square extends Figure {
    private double side;

    public Square(double side, String name) {
        super(ColorSupplier.setColors(), name);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea()
                + " sq. units, side: " + this.side
                + " units. color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
}
