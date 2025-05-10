package core.basesyntax;

import java.awt.Color;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color, FigureTypes name) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        String triangleInfo = "Figure: "
                + FigureTypes.RIGHTTRIANGLE
                + ", area: "
                + getArea()
                + " sq.units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getColor();
        System.out.println(triangleInfo);
    }
}
