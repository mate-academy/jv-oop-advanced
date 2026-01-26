package core.basesyntax;

public class Rectangle extends Figure{
    private double height;
    private double width;

    public Rectangle(String color, int height, int length) {
        super(color);
        this.height = height;
        this.width = length;
    }
    @Override
    public double getArea() {
        return height * width;
    }
    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq. units, height: "
                + height
                + " units, width: "
                + width
                + " units, color: "
                + color);
    }
}
