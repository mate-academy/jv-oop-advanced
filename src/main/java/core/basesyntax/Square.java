package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: square, area: "
                + decimalFormat.format(getArea())
                + " sq.units, side: "
                + (int) side
                + " units, color: "
                + getColor());
    }
}
