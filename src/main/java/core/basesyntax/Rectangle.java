package core.basesyntax;

public class Rectangle extends Figure {
    private int shortside;
    private int longside;

    public Rectangle(String color, int shortside, int longside) {
        super(color);
        this.shortside = shortside;
        this.longside = longside;
    }

    @Override
    public double getArea() {
        return shortside * longside;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Rectangle, area: " + getArea()
                        + " sq.units, side1: " + shortside
                        + " units, side2: " + longside + " units, color: " + getColor());
    }
}
