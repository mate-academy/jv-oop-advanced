package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color) {
        super(color);
    }

    @Override
    public void drow() {
        System.out.println("Figure: Circle, color: " + getColor()
                + " radius: " + radius + ", area: " + getArea());
    }

    @Override
    public void areaObtain() {
        setArea(Math.PI * Math.pow(radius, 2));
    }
}
