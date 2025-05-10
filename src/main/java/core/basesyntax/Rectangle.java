package core.basesyntax;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(String.format("Length: %s. Width: %s", length, width));
    }
}
