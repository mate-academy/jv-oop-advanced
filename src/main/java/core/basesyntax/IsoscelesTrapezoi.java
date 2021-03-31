package core.basesyntax;

public class IsoscelesTrapezoi extends Figure {
    private int high;
    private int avrgLine;

    public IsoscelesTrapezoi(String color, int high, int avrgLine) {
        super(color, "isosceles trapezoid");
        this.high = high;
        this.avrgLine = avrgLine;
    }

    @Override
    public int getArea() {
        return avrgLine * high;
    }

    @Override
    public String draw() {
        return super.draw() + ", high: " + this.high + ", avrgLine: " + this.avrgLine;
    }
}
