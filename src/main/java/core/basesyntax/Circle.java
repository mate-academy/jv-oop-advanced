package core.basesyntax;

public class Circle extends Figure {
    int radius;
    @Override
    public String draw() {
        return "circle, " +
                "area: " + getArea() + "sq. units, " +
                "radius: " + radius + "units, " +
                "color: " + color;
    }
    @Override
    public int getArea() {
        return (int) Math.PI * radius * radius;
    }
}
