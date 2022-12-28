package core.basesyntax;

public class Rectangle extends Figure {
    final double side;

    public Rectangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:  " + getArea() + " sq.units " + " side: "
                + side + " units " + " color: " + getColor());
    }
}

