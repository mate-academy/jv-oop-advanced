package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double countArea() {
        double area = 0;
        area = Math.PI * radius * 2;
        return area;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: "
                + countArea() + ", radius: " + radius);
    }
}
