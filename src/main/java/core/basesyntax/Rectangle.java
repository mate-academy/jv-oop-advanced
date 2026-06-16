package core.basesyntax;

public class Rectangle extends Figure{
    private double width;
    private double length;

    public Rectangle(String color, Double width, Double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.2f sq. units, width: %.2f sq. units" +
                ", length: %.2f sq. units, color: %s"
                , getArea(), width, length, getColor()));
    }
}
