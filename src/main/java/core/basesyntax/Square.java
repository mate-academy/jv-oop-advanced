package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
        this.color = color;
    }

    @Override
        public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square...");
        System.out.println("Side: " + side);
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
    }

}
