package core.basesyntax;

public class Circle extends Figure {
    private int side1;

    public Circle(String color, int side1) {
        super(color);
        this.side1 = side1;
    }

    public double getArea() {
        return Math.PI * Math.pow(side1,2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Circle, "
                + "area: "
                + getArea()
                + " units, side: "
                + side1
                + " units,"
                + " color: "
                + color);
    }
}
