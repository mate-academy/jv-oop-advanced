package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, area: "
                + String.format("%.2f", this.getArea()) + " sq. units, side A: "
                + this.sideA + " units, side B:"
                + this.sideB + " units, color: "
                + this.getColor());
    }

    public double getArea() {
        return sideA * sideB;
    }
}
