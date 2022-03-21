package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        super.setColor(color);
    }

    @Override
    public void toDraw() {
        System.out.println("Type = Square, side = "
                + side + ", area = " + getArea()
                + ", color = " + super.getColor());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
