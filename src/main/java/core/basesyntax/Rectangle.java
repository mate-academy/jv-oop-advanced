package core.basesyntax;

public class Rectangle extends Figure {
    public Rectangle(int sideX, int sideY, String color) {
        super(sideX, sideY, color);
    }

    public double area() {
        return Math.round((sideX * sideY) * 10) / 10.0;
    }

    public String draw() {
        return "Figure: rectangle, area: " + area()
                + " sq. units, first side: " + sideX
                + " units, second side: " + sideY
                + " units, color: " + color;
    }
}
