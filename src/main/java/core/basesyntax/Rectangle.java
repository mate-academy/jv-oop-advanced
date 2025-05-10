package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        this.type = "Rectangle";
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("\n=================\ntype: "
                + this.type
                + "\ncolor: "
                + this.color
                + "\nwidth: "
                + this.width
                + "\nheight: "
                + this.height
                + "\narea: "
                + this.getArea());
    }
}
