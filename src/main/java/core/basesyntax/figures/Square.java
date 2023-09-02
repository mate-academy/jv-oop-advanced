package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Square  extends Figure {
    private double side;


    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.print("Figure: square, area: ");
        System.out.print(setDecimalFormat(area()));
        System.out.print(" sq.units, side: " + side + " units, color: " + getColor());
        System.out.println();
    }
}
