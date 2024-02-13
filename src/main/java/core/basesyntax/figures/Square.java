package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super("square", color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print("side: " + side + " units" + System.lineSeparator());
    }
}
