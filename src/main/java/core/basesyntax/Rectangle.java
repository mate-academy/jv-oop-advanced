package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secontLeg;

    public Rectangle(String color, int firstLeg, int secontLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secontLeg = secontLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secontLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Ractangle, area: " + calculateArea()
                + ", first Leg: " + firstLeg + ", second Leg: " + secontLeg + ", color: " + color);
    }
}
