package core.basesyntax;

public class Circle extends Figure implements Informable, AreaCounter {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void countArea() {
        double area = 0;
        area = Math.PI * radius * 2;
        super.setArea(area);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + ", radius: " + radius);
    }
}
