package core.basesyntax;

public class Rectangle extends Figure {
    private final String name = "Rectangle";
    int sideA;
    int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super.color = color;
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
        draw.append(", area: " +  getArea() + " sq.units");
        draw.append(", sideA: " + sideA);
        draw.append(", sideB: " + sideB);
        draw.append(", color: " + color);
        System.out.println(draw.toString());
    }
}
