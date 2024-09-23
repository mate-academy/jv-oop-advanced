package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("rectangle,"
                + " area: " + getArea()
                + " sq.units,"
                + " height: "
                + height + " sq.units, "
                + " width: "
                + width + " sq.units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
