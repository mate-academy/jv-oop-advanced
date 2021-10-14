package core.basesyntax;

public class RightTriangle extends Figure {
    private final String name = "Right Triangle";
    int firstLeg;
    int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        StringBuilder draw = new StringBuilder();
        draw.append("Figure: " + getName());
        draw.append(", area: " +  getArea() + " sq.units");
        draw.append(", firstLeg: " + firstLeg);
        draw.append(", secondLeg: " + secondLeg);
        draw.append(", color: " + color);
        System.out.println(draw.toString());
    }
}
