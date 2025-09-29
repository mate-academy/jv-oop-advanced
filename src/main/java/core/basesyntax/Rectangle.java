package core.basesyntax;

public class Rectangle extends Figure {

    private final double width;
    private final double height;

    public Rectangle(String randomColor, double randomWidth, double randomHeight) {
        super(randomColor);
        this.width = randomWidth;
        this.height = randomHeight;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
