package core.basesyntax;

public class Rectangle extends Figure {
    private double area;
    private double verticalSide;
    private double horizontalSide;

    public void setVerticalSide(double verticalSide) {
        this.verticalSide = verticalSide;
    }

    public void setHorizontalSide(double horizontalSide) {
        this.horizontalSide = horizontalSide;
    }

    public double getVerticalSide() {
        return verticalSide;
    }

    public double getHorizontalSide() {
        return horizontalSide;
    }

    public double getArea() {
        return area;
    }

    public double areaCalculator() {
        return area = verticalSide * horizontalSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq. units, vertical side: "
                + getVerticalSide() + " units, horizontal side: "
                + getHorizontalSide() + " units, color: "
                + getColor();
    }
}
