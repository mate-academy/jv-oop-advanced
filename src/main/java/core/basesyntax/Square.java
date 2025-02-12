package core.basesyntax;

public class Square extends Figure implements Interface {
    private final double side;
    private final String name = "square";

    Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getArea() {
        return (Math.round(side * side) * 10.0) / 10.0;
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() +
                " sq. units, side: " + side + " units, color: " + color);
    }
}
