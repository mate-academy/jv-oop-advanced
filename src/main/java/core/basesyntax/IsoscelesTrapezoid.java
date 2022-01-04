package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstProperty;
    private int secondProperties;

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    public IsoscelesTrapezoid(String color, int firstProperty, int secondProperties) {
        super(color);
        this.firstProperty = firstProperty;
        this.secondProperties = secondProperties;
    }

    @Override
    public int getArea() {
        return (firstProperty + secondProperties) / 2;
    }

    @Override
    public void draw() {
        int area = getArea();
        String color = getColor();

        System.out.println("Figure: isosceles trapezoid, area: " + area + ", color: " + color);
    }
}
