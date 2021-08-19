package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideTop;
    private int sideButton;
    private int height;

    public IsoscelesTrapezoid(String color, int sideTop, int sideButton, int height) {
        super(color);
        this.sideTop = sideTop;
        this.sideButton = sideButton;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid, area: "
                + getArea() + " sq.units, sideTop: " + sideTop
                + " units, sideButton: " + sideButton + " units, height:"
                + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (sideTop + sideButton) * (double) height / 2;
    }
}
