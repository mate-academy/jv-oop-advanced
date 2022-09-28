package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double findArea() {
        if (getArea() == 0.0) {
            return side * side;
        } else {
            System.out.println("The area has been already calculated");
            return getArea();
        }
    }

    @Override
    public String draw() {
        return "Figure: Square, "
                + "side: " + side
                + " units, area: " + findArea()
                + " sq.units, " + "color: " + getColor();
    }
}
