package core.basesyntax;

public class Rectangle extends Figure {
    private int firstProperty;
    private int secondProperties;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, int firstProperty, int secondProperties) {
        super(color);
        this.firstProperty = firstProperty;
        this.secondProperties = secondProperties;
    }

    @Override
    public int getArea() {
        return firstProperty * secondProperties;
    }

    @Override
    public void draw() {
        int area = getArea();
        String color = getColor();

        System.out.println("Figure: rectangle, area: " + area + " sq. , color: " + color);
    }
}
