package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int at;
    private final int bt;
    private final int ht;

    public IsoscelesTrapezoid(String color, int at, int bt, int ht) {
        super(color);
        this.at = at;
        this.bt = bt;
        this.ht = ht;
    }

    public double getArea() {
        return (at+bt) * ht;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, at: " + at + " units, bt: " + bt + " units, ht: "
                + ht + " units, color: " + getColor());
    }
}
