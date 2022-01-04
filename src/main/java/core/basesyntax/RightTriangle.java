package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstProperty;
    private int secondProperties;

    public RightTriangle(String color) {
        super(color);
    }

    public RightTriangle(String color, int firstProperty, int secondProperties) {
        super(color);
        this.firstProperty = firstProperty;
        this.secondProperties = secondProperties;
    }

    @Override
    public int getArea() {
        return (firstProperty * secondProperties) / 2;
    }

    @Override
    public void draw() {
        int area = getArea();
        String color = getColor();

        System.out.println("Figure: right triangle, area: " + area + ", color: " + color);
    }
}
