package core.basesyntax;

public class Rectangle extends Figure {
    private final int heigh;
    private final int width;

    public Rectangle(Color color, int heigh, int width) {
        super.setColor(color);
        this.heigh = heigh;
        this.width = width;
    }

    @Override
    public double getArea() {
        return heigh * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + "sq.units, side1: " + heigh + " , side2: "
                + width + " units, color: " + getColor());
    }
}
