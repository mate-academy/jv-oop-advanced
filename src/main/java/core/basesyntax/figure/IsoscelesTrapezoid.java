package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;

public class IsoscelesTrapezoid extends Figure {
    private double sideFirst;
    private double sideSecond;
    private double height;

    public IsoscelesTrapezoid(double sideFirst, double sideSecond, double height) {
        this.setFigureName(FigureName.ISOSCELEXTRAPEZOID);
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.height = height;
        this.setColor();
    }

    @Override
    public double getArea() {
        return ((sideFirst + sideSecond) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "sidefirst: " + sideFirst + ", sideSecond: " + sideSecond + ", height: " + height
                + ", color: " + this.getColor();
    }
}
