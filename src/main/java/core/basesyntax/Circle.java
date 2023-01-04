package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
        super.setArea(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void print() {
        super.print();
        System.out.println("radius: " + radius + " units, "
                + "area: " + getArea() + " square units");
    }
}
