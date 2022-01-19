package core.basesyntax;

public class Rectangle extends Figure implements FigureProperties {
    private double sideA;
    private double sideB;
    private String color;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: rectangle. SideA: " + sideA + " mm." + " SideB: " + sideB
                + "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

}
