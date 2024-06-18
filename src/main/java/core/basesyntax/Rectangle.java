package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Rectangle, "
                + "area: "
                + getArea()
                + " units, firstLeg: "
                + side1
                + " units, secondLeg: "
                + side2
                + " units, color: "
                + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
