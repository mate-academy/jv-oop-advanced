package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height,
                              String color, String typeOfFigure) {
        super(color, typeOfFigure);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((baseA + baseB) / 2) * getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure() + ", area: " + getArea()
                + " sq.units, height: " + getHeight() + " units, color: " + getColor());
    }
}
