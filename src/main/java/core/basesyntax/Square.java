package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String name = "Square";

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
                + name
                + ", area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor();
        System.out.println(squareInfo);
    }
}
