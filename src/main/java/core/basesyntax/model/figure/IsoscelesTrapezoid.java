package core.basesyntax.model.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Drawable;

public class IsoscelesTrapezoid extends Figure {

    private int firstParallel;
    private int secondParallel;
    private int side;

    public IsoscelesTrapezoid(Color color, int firstParallel, int secondParallel, int side) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.side = side;
    }

    @Override
    public void draw() {
        String area = Drawable.doubleToString(area());
        String status = new StringBuilder()
                .append("Figure: rectangle, area: ")
                .append(area)
                .append(" sq.units, first parallel: ")
                .append(firstParallel)
                .append(" units, second parallel: ")
                .append(secondParallel)
                .append(" units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(this.color).toString();
        System.out.println(status);
    }

    @Override
    public double area() {
        int hypotenuse = side;
        int firstLeg = Math.abs((firstParallel - secondParallel) / 2);
        double secondLeg = Math.sqrt(hypotenuse) - Math.sqrt(firstLeg);
        double firstRectangleArea = firstLeg * secondLeg;
        double secRectangleArea = secondLeg * (firstParallel + secondParallel - 2 * firstLeg) / 2;
        return firstRectangleArea + secRectangleArea;
    }
}
