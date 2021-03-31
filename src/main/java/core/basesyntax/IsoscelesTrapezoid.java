package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBaseSide;
    private double secondBaseSide;
    private double height;

    public IsoscelesTrapezoid() {
        super("isosceles trapezoid");
        this.firstBaseSide = FigureSupplier.getRandomProperties();
        this.secondBaseSide = FigureSupplier.getRandomProperties();
        this.height = FigureSupplier.getRandomProperties();
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((firstBaseSide + secondBaseSide) / 2) * getHeight();
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
            + ", area: " + getArea()
            + ", height: " + getHeight()
            + ", color: " + getColor();
    }
}
