package core.basesyntax;

public class Rectangle extends Figure implements FigureInterface {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, " +
                "area: " + area() + " sq.units, " +
                "side A: " + getSideA() + " units, " +
                "side B: " + getSideB() + " units, " +
                "color: " + getColor());
    }
}
