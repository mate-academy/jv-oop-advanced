package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;

public class Rectangle extends Figure {
    private double sideBasis;
    private double height;

    public Rectangle(double sideBasis, double height, String color) {
        this.sideBasis = sideBasis;
        this.height = height;
        this.setFigureName(FigureName.RECTANGLE);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (sideBasis * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "sideBasis: " + sideBasis + ", height: " + height
                + ", color: " + this.getColor());
    }
}
