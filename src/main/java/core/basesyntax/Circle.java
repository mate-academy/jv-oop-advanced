package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void findArea() {
        if (getArea() == 0.0) {
            setArea(radius * radius * Math.PI);
        } else {
            System.out.println("The area has been already calculated");
        }
    }

    @Override
    public String draw() {
        return "Figure: Circle, "
                + "radius: " + radius
                + " units, area: " + getArea()
                + " sq.units: "
                + "color: " + getColor();
    }
}
