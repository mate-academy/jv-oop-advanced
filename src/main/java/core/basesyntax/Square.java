package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side,2);
    }

    public String draw() {
        return "\n" + "Square - " + getColor()
                + "\n" + "side: " + side
                + "\n" + "area: " + getArea();
    }
}
