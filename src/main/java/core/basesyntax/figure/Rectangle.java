package core.basesyntax.figure;

public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public double getArea() {

        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureList.RECTANGLE + ", area: " + getArea()
                + " sq.units, sideA: " + sideA + " units, sideB: " + sideB
                + " units, color: " + getColor());
    }
}
