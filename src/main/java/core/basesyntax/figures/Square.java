package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.print("\nType: square"
                + "\nSide: " + side
                + "\nColor: " + getColor()
                + "\n Area: " + getArea()
                + "\n-----------");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
