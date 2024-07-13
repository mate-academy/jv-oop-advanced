package core.basesyntax;

public class Rectangle extends Figure {
    private String color;
    private int length;
    private int width;

    public Rectangle(String color, int length,int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.2f sq. units, side %d units, color: %s%n",
                calculateArea(),length, width, color
        );
    }
}
