package core.basesyntax;

public class Rectangle extends FigureAbstract {
    private int length;
    private int width;
    private int area;

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
        this.area = getArea();
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public String drawInfo() {
        return "Figure: "
                +
                getName()
                +
                ", area: " + area
                +
                ", length: " + length
                +
                ", width: " + width
                +
                ", color: " + getColor();
    }
}
