package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double side;

    public Rectangle(double height, double side, Color color) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle\n"
                + "area: " + findArea() + "sq.units\n"
                + "height: " + height + "units\n"
                + "side: " + side + "units\n"
                + "color: " + getColor());
    }

    @Override
    public double findArea() {
        return 0.5 * height * side;
    }
}
