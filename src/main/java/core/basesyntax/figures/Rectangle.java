package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        area();
    }

    @Override
    public void area() {
        area = secondLeg * firstLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + area + " sq.units, " + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, " + " color: " + color);
    }
}
