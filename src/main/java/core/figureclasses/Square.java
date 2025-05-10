package core.figureclasses;

import java.text.DecimalFormat;

public class Square extends Figure {
    private final int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: " + this.name + ", area: "
                + decimalFormat.format(area()) + " sq.units, side: "
                + side + " units, color: " + this.color);
    }
}
