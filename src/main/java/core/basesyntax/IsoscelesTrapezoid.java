package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public Figure create() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.firstSide = getRandom().nextInt(getMaxSize());
        isoscelesTrapezoid.secondSide = getRandom().nextInt(getMaxSize());
        isoscelesTrapezoid.height = getRandom().nextInt(getMaxSize());
        isoscelesTrapezoid.setColor(getColorSupplier().getRandomColor());
        return isoscelesTrapezoid;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + this.getArea() + " sq.units, first side: "
                + this.firstSide + " units, second side: "
                + this.secondSide + " units, height: "
                + this.height + " units, color: "
                + this.getColor();
    }
}
