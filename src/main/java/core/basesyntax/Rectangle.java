package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int heightR;

    public Rectangle(String color, int width, int heightR) {
        super(color);
        this.width = width;
        this.heightR = heightR;

    }

    @Override
    public double getAreaCalculator() {
        return heightR * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getAreaCalculator()
                + " sq. units, width: " + width + " units, height: "
                + heightR + " units, color: " + getColor());
    }
}
