package core.figureclasses;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final double firstOppositeSide;
    private final double secondOppositeSide;

    public IsoscelesTrapezoid(String name, String color, int height,
                              int firstOppositeSide, int secondOppositeSide) {
        super(name, color);
        this.firstOppositeSide = firstOppositeSide;
        this.secondOppositeSide = secondOppositeSide;
        this.height = height;
    }

    @Override
    public double area() {
        return (firstOppositeSide + secondOppositeSide) / 2 * height;
    }

    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: " + this.name + ", area: " + decimalFormat.format(area())
                + " sq.units, height: " + height + " units, first opposite side: "
                + firstOppositeSide + " units, second opposite side: "
                + secondOppositeSide + " units, color: " + this.color);
    }
}
