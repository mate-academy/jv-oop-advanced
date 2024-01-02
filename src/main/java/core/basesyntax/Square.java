package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;

    }

    @Override
    public void draw() {
        System.out.println("Type = Square, side = "
                + side + ", area = " + getArea()
                + ", color = " + super.getColor());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
