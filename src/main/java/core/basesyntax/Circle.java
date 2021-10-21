package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
        float valueOfArea = countArea();
        setArea(valueOfArea);
    }

    @Override
    public float countArea() {
        return (float) (Math.PI * radius * radius);
    }

    public void draw() {
        System.out.println("Circle, " + "area: " + getArea() + " sq.units" + " radius: "
                + radius + " units" + ", color: " + getColor());
    }
}
