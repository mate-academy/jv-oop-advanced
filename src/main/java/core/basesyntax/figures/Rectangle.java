package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int longLeg = 10;
    private int shortLeg = 20;

    @Override
    public int area() {
        return longLeg + shortLeg;
    }

    public void print() {
        System.out.println("Figure: rectangle, area: " + this.area() + " longLeg: "
                + this.longLeg + " units, secondLeg: " + this.shortLeg + " units, color: "
                + this.getColor());
    }
}
