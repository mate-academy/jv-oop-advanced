package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBaseSide;
    private final double secondBaseSide;
    private final double height;

    public IsoscelesTrapezoid(
            String color, double firstBaseSide, double secondBaseSide, double height) {
        super(color);
        this.firstBaseSide = firstBaseSide;
        this.secondBaseSide = secondBaseSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBaseSide + secondBaseSide) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, first base side: "
                + firstBaseSide + " units, second base side: "
                + secondBaseSide + " units, height "
                + height + " units, color: " + getColor());
    }
}


