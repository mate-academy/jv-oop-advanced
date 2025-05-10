package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String squareInfo = "Figure: "
                + this.getClass().getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor();
        System.out.println(squareInfo);
    }
}
