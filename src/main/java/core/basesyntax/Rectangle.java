package core.basesyntax;

public class Rectangle extends Figure implements FigureProperties {
    private int sideA;
    private int sideB;
    private String color;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: rectangle. SideA: " + sideA + " mm." + " SideB: " + sideB +
                "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

}
