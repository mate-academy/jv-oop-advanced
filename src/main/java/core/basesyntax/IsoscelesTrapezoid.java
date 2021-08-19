package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int sideTop;
    private int sideButton;
    private int height;

    public IsoscelesTrapezoid() {
        super();
        this.sideTop = new Random().nextInt(7);
        this.sideButton = new Random().nextInt(13);
        this.height = new Random().nextInt(10);
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
