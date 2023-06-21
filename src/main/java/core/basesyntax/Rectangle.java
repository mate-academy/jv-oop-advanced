package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, height: " + height + " units, color: " + color);
    }
}
