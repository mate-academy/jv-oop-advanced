package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        this.setName("rectangle");
        this.setColor(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return side1 * side2;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side1: "
                + side1 + " units, side2: " + side2 + " units, color: " + getColor());
    }
}
