package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
        setArea(sideA * sideB);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, side a: "
                + sideA + " units, side b: " + sideB + " units, color: " + getColor());
    }
}
