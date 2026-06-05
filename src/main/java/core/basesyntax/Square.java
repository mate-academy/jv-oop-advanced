package core.basesyntax;

public class Square extends Figure {
    public Square(int sideX, String color) {
        super(sideX, color);
    }

    public double area() {
        return Math.round(Math.pow(sideX, 2) * 10) / 10.0;
    }

    public String draw() {
        return "Figure: square, area: " + area()
                + " sq. units, side: " + sideX
                + " units, color: " + color;
    }
}
