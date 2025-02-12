package core.basesyntax;

public class Rectangle extends Figure implements Interface {
    private final double bigSide, smallSide;
    private final String name = "rectangle";

    Rectangle(double bigSide, double smallSide, String color) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
        this.color = color;
    }

    public double getArea() {
        return (Math.round(bigSide * smallSide) * 10.0) / 10.0;
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, big side: " + bigSide + " units, small side: " + smallSide + " units, color: " + color);
    }
}
