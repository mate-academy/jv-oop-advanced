package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Square Side: " + side);
    }
}

