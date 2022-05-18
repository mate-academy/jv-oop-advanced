package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, int radius, String color) {
        super(name, color);
        this.radius = radius;
        setName("circle");
    }

    @Override
    public int area() {
        return radius * 2;
    }

    @Override
    public String giveAllTheInformation() {
        return "Figure: " + getName() + "area: " + area() + "sq.units, " + "radius: "
                + radius + " color: " + getColor();
    }
}
