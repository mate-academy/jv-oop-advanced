package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int i, int i1) {
        super(color);
        this.width = i;
        this.height = i1;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + "circle " + " area " + getArea()
                + " sq. units, width: " + width + "units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
