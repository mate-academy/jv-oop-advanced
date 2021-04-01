package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return ("Figure: " + figure() + " ,area: " + getArea() + "radius : " + radius);
    }

    @Override
    public String figure() {
        return "Circle";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Haven't corners");
    }
}
