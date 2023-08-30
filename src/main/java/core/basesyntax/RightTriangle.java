package core.basesyntax;

public class RightTriangle extends FigureAbstract {
    private int length;
    private int width;
    private int area;

    protected RightTriangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
        area = getArea();
    }

    @Override
    public int getArea() {
        return length * width / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                +
                getName()
                +
                ", area: " + area
                +
                ", length: " + length
                +
                ", width: " + width
                +
                ", color: " + getColor());
    }
}
