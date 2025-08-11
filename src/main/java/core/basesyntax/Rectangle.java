package core.basesyntax;

public class Rectangle extends Figure {
    private double side;
    private double width;

    public Rectangle(String color, double side, double width) {
        this.color = color;
        this.side = side;
        this.width = width;
    }


    @Override
    public double getArea() {
        return side * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, " +
                "area: "
                + getArea()
                + " width: "
                + width
                + " side: "
                + side
                + " color: "
                + color);
    }
}
