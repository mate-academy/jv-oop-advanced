package core.basesyntax;

public class Square extends Figure {
    private double width;

    public Square(String color, double width) {
        super(color);
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + width + " units, color: " + getColor());
    }
}
