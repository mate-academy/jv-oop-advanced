package core.figureclasses;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private final double side;
    private final double height;

    public RightTriangle(String name, String color, int side, int height) {
        super(name, color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return side * height / 2;
    }

    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: " + this.name + ", area: "
                + decimalFormat.format(area()) + " sq.units, side: "
                + side + " units, height: " + height + " units, color: " + this.color);
    }
}
