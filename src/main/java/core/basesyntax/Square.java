package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("square, area: " + this.getArea() + " sq.units, side: "
                           + this.side + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
