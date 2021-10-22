package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int downSide;
    private int side;

    IsoscelesTrapezoid(int upperSide, int downSide, int sideC, String color) {
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.side = sideC;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((upperSide + downSide) / 2)
                * Math.sqrt(side * side - Math.pow((downSide - upperSide), 2) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + upperSide + " units, sideB: " + downSide
                + " units, sideC: " + side + " units, color: " + getColor());
    }
}
