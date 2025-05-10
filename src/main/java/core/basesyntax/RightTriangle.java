package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.RIGHTTRIANGLE);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name() + ", area: " + getArea()
                + " sq.units, firstLeg: " + this.firstLeg
                + " units, secondLeg: " + this.secondLeg
                + " units, color: " + getColor());
    }
}
