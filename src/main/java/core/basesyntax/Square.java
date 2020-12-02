package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, int side, double area) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getSide() {
        return side;
    }

    public String draw() {
        String returnLine = "Figure: circle, " + "area: " + getArea() + " sq. units, side: " +
                getSide() + " units, color: " + getColor();
        return returnLine;
    }
}
