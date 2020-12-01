package core.basesyntax;

public class Circle extends Figures {

    private int radius;

    public Circle(int radius, String color) {
        super(radius, color);
        this.radius = radius;
        setArea(Math.PI * radius * radius);
    }

    @Override
    public void print() {
        System.out.println("Shape: circle, area: " + getArea() + " sq. units, radius: "
                + getUniqueParameter() + " units, color: " + getColor());
    }
}
