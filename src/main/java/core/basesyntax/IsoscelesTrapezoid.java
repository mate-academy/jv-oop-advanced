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
                + this.getArea() + " sq.units, sideTop: " + this.sideTop
                + " units, sideButton: " + this.sideButton + " units, height:"
                + this.height + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return (this.sideTop + this.sideButton) * (double) this.height / 2;
    }
}
