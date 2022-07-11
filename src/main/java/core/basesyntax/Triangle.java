package core.basesyntax;

public class Triangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Triangle(FigureType figureType, double firstLeg, double secondLeg, Color color) {
        super(figureType, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getFigureType()
                + ", area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + super.getColor());
    }
}
