package core.basesyntax;

public class Circle extends Figure {
    private int radius;

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
        area = radius * radius * Math.PI;
        System.out.println("Figure:  " + getName() + ",  area:  " + area + " sq.units"
                + "  radius = " + radius + "units" + " color:  " + getColor());
    }
} //
