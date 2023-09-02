package core.basesyntax;

public class RightTriangle extends FigureAbstract {
    private static RightTriangle rightTriangle = new RightTriangle();
    private int length;
    private int width;
    private int area;

    protected RightTriangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
        area = getArea();
    }

    public RightTriangle() {

    }

    @Override
    public int getArea() {
        return length * width / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                +
                rightTriangle.getClass().getSimpleName().toLowerCase()
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
