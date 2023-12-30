package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import core.basesyntax.FigureSupplier;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private FigureSupplier figureSupplier = new FigureSupplier();

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, "
                + "first side: " + firstSide + " units, second side: " + secondSide
                + " units, color: " + color.toLowerCase());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
