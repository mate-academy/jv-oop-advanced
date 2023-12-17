package core.basesyntax;

public class Square extends Figure {
    private double area;
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return area;
    }

    public double areaCalculator() {
        return area = side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq. units, side: "
                + getSide() + " units, color: "
                + getColor();
    }
}
