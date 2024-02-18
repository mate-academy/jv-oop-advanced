package core.basesyntax.figureshapes;

import core.basesyntax.Figure;
import core.basesyntax.FigureArea;

public class IsoscelesTrapezoid extends Figure implements FigureArea {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase,int height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public void draw() {
        {
            System.out.println("Figure: isoscelesTrapezoid, area: "
                    + calculateArea()
                    + " sq. units, lowerBase: "
                    + lowerBase
                    + " units, upperBase: "
                    + upperBase
                    + " units, height: "
                    + height
                    + " units, color: "
                    + getColor());
        }
    }

    @Override
    public double calculateArea() {
        return ((lowerBase + upperBase) / 2) * height;
    }
}
