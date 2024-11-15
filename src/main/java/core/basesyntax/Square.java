package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(String.valueOf(color));
        this.side = side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("side: " + side + " units");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
