package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class IsoscelesTrapezoid  extends Figure {
    private double parallelSide;
    private double height;


    public void setParallelSide(double parallelSide) {
        this.parallelSide = parallelSide;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double area() {
        return (((parallelSide + parallelSide) / 2)) * height;
    }

    @Override
    public void draw() {
        System.out.print("Figure: isosceles trapezoid, area: ");
        System.out.print(setDecimalFormat(area()));
        System.out.print(" sq.units, parallel side: " + parallelSide + " units, height: "
                + height + " units, color: " + getColor());
        System.out.println();
    }
}
