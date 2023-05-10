package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Figure: square; "
                + "area: " + getArea() + " sq.units"
                + "; side: " + side
                + "; colour: " + this.getColor()
                + ';';
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("area: " + getArea() + " sq.units");
    }
}
