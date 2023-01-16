package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    public static final double PI = Math.PI;

    public Circle() {
        super();
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color, String name, int radius) {
        super(color, name);
        this.radius = radius;
    }

    public void draw() {
        double area;
        area = radius * radius * PI;
        System.out.println("Figure: " + getName() + ",  area: " + area +" sq.units" + "  radius = " + radius+"units" + " color: " + getColor());
    }
}
