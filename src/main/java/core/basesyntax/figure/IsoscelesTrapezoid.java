package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    double sideFirst;
    double sideSecond;
    double height;

    IsoscelesTrapezoid(double sideFirst, double sideSecond, double height) {
        this.figureName = FigureName.IsoscelesTrapezoid;
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.height = height;
    }
    @Override
    public double getArea() {
        return ((sideFirst + sideSecond) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: " + figureName + ", "
                + "area: " + getArea() + " sq. units, "
                + "sidefirst: " + sideFirst + ", sideSecond: " + sideSecond + ", height: " + height
                + ", color: " + color;

    }
}
