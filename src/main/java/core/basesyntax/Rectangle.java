package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.RECTANGLE);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void buildFigure() {
        System.out.println("Figure: " + name() + ", area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + ", secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
