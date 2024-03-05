package core.basesyntax;

public class Square extends RandomFigure {
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
        System.out.println("Loading a Square \n" + "Area: " + getArea() + "\n"
                + "Color: " + color + "\n" + "Side: " + side);
    }
}
