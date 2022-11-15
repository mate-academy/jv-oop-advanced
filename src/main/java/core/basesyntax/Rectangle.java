package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + this.getArea() + " sq.units, first side: "
                + this.firstSide + " units, second side: "
                + this.secondSide + " units, color: "
                + this.getColor();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public Figure create() {
        Rectangle rectangle = new Rectangle();
        rectangle.firstSide = getRandom().nextInt(getMaxSize());
        rectangle.secondSide = getRandom().nextInt(getMaxSize());
        rectangle.setColor(getColorSupplier().getRandomColor());
        return rectangle;
    }
}
