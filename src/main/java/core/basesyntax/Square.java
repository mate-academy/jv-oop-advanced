package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return side * 2;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: square"
                + ", area: " + obtainArea() + " sq.units"
                + ", side: " + side + " units"
                + ", color: " + super.getColor().toLowerCase();
    }
}
