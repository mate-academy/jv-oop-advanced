package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void findArea() {
        if (area == 0.0) {
            area = radius * radius * Math.PI;
        } else {
            System.out.println("The area has been already calculated");
        }
    }

    @Override
    public String draw() {
        return "Figure: Circle, "
                + "radius: " + radius
                + " units, area: " + area
                + " sq.units: "
                + "color: " + getColor();
    }
}
