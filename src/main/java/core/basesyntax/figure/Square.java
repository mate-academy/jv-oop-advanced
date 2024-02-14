package core.basesyntax.figure;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
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
        System.out.println("side: " + side + " units");
    }
}
