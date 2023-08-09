package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.width = sideA;
        this.length = sideB;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", width: " + width + " units, length: " + length + " units");
    }
}
