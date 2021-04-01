package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBaseSide;
    private double secondBaseSide;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double firstBaseSide,
                              double secondBaseSide, double height) {
        super(name, color);
        this.firstBaseSide = firstBaseSide;
        this.secondBaseSide = secondBaseSide;
        this.height = height;
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
