package core.basesyntax.figure;

import core.basesyntax.enumforfigure.Color;
import core.basesyntax.enumforfigure.FigureType;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height, Color color) {
        super(color, FigureType.ISOSCELESTRAPEZOID);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return (this.secondBase + this.firstBase) * 0.5 * this.height;
    }

    @Override
    public void draw() {
        //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        System.out.println("Figure: " + this.figureType + ", area: "
                + this.getArea() + " sq.units, firstBase: " + this.firstBase
                + " units, secondLeg: " + this.secondBase + " units, height: "
                + this.height + " units, color: " + this.color);
    }
}
