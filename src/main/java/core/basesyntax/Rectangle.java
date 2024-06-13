package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, " + "area: " + this.getArea()
                            + " sq. units, length: " + this.length + " units, width: "
                            + width + " units, color: " + super.getColor().name());
    }
}
