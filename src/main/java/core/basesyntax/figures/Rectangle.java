package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.width = sideA;
        this.height = sideB;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Side A: %s, Side B: %s, Color: %s, Area: %.2f",
                width, height, color, getArea()));
    }
}
