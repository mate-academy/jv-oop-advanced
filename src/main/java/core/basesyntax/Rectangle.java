package core.basesyntax;

public class Rectangle extends Figure {
    private double side;
    private double base;

    public Rectangle() {
    }

    public Rectangle(String color, double side, double base) {
        super(color);
        this.base = base;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return side * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle" + ", area: "
                + getArea() + " sq.units" + ", side: "
                + getSide() + " units" + ", base: " + getBase()
                + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getPerimeter() {
        return side * 2 + base * 2;
    }
}
