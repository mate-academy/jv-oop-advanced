package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;

public class Rectangle extends Figure {
    private double sideBasis;
    private double height;

    public Rectangle(double sideBasis, double height) {
        this.sideBasis = sideBasis;
        this.height = height;
        this.setFigureName(FigureName.Rectangle);
    }

    @Override
    public double getArea() {
        return (sideBasis * height) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "sideBasis: " + sideBasis + ", height: " + height
                + ", color: " + this.getColor();
    }
}
