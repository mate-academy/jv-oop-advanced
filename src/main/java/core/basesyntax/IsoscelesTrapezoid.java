package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int leg;
    private int height;

    public IsoscelesTrapezoid(String type, String color, int firstBase,
                              int secondBase, int leg, int height) {
        super(type, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height / (double) 2 * (firstBase + secondBase) * leg;
    }

    @Override
    public String getDrawing() {
        return "Figure : " + getType() + ", area: " + getArea()
                + " sq.units, first Base: " + firstBase + " second base: "
                + secondBase + " units, leg: " + leg + " height: " + height
                + " color: " + getColor();
    }
}
