package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color,double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color1, double radius) {
        this.color1 = ColorSupplier.getRandomColor();
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + getArea()
                + " sq.units, " + "radius: "
                + radius + " units, " + "color: "
                + getColor());
    }

    @Override
    public void draw2() {
        System.out.println("Figure: circle, "
                + "area: " + getArea()
                + " sq.units, " + "radius: "
                + radius + " units, " + "color: "
                + getColor1());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

