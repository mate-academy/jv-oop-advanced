package core.basesyntax;

public class Rectangle extends Figure {
    private double verticalSide;
    private double horizontalSide;

    public Rectangle(String color, double verticalSide, double horizontalSide) {
        super(color);
        this.verticalSide = verticalSide;
        this.horizontalSide = horizontalSide;
        this.area = areaCalculator();
    }

    public double getVerticalSide() {
        return verticalSide;
    }

    public double getHorizontalSide() {
        return horizontalSide;
    }

    @Override
    public double areaCalculator() {
        return this.area = verticalSide * horizontalSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, vertical side: "
                + getVerticalSide() + " units, horizontal side: "
                + getHorizontalSide() + " units, color: "
                + getColor());
    }
}
