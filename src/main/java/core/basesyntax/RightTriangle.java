package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String type, String color,int firstLeg, int secondLeg) {
        super(type, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / (double) 2;
    }

    @Override
    public String getDrawing() {
        return "Figure : " + getType() + ", area: " + getArea()
                + " sq.units, first leg: " + firstLeg + " second leg: "
                + secondLeg + " units, color: " + getColor();
    }
}
