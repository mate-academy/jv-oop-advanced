package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int longLeg;
    private final int shortLeg;

    public Rectangle(int longLeg, int shortLeg, String color) {
        super(color);

        this.longLeg = longLeg;
        this.shortLeg = shortLeg;
    }

    @Override
    public int getArea() {
        return longLeg + shortLeg;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.getArea() + " longLeg: "
                + this.longLeg + " units, secondLeg: " + this.shortLeg + " units, color: "
                + this.getColor());
    }
}
