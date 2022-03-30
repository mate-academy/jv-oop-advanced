package core.figureclasses;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String name, String color, int firstSide, int secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: " + this.name + ", area: "
                + decimalFormat.format(area()) + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units, color: " + this.color);
    }
}
