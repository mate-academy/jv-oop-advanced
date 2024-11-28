package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double top;
    private double down;
    private double height;

    public IsoscelesTrapezoid(String color, double top, double down, double height) {
        super(color);
        this.top = top;
        this.down = down;
        this.height = height;
    }

    @Override
    public double calculateSquare() {
        return (top + down) * height / 2;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + calculateSquare()
                + " sq. units, top: " + top
                + " sq. units, down: " + down
                + " sq. units, height: " + height
                + " units, color: " + color;
    }
}
