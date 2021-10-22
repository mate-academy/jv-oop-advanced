package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int downSide;
    private int side;

    public IsoscelesTrapezoid(int upperSide, int downSide, int sideC, String color) {
        super(color);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.side = sideC;
    }

    @Override
    public double getArea() {
        return ((upperSide + downSide) / 2)
                * Math.sqrt(side * side - Math.pow((downSide - upperSide), 2) / 4);
    }

    @Override
    public void print() {
        System.out.println("Figure: Isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + upperSide + " units, sideB: " + downSide
                + " units, sideC: " + side + " units, color: " + getColor());
    }
}
