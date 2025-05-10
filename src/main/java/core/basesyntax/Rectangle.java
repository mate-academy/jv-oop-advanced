package core.basesyntax;

public class Rectangle extends Figure {
    private final String name = "Rectangle";
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getArea() {
        return sideA * sideB;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        StringBuilder draw = new StringBuilder();
        draw.append("Figure: " + getName());
        draw.append(", area: " + getArea() + " sq.units");
        draw.append(", sideA: " + sideA);
        draw.append(", sideB: " + sideB);
        draw.append(", color: " + getColor());
        System.out.println(draw.toString());
    }
}
