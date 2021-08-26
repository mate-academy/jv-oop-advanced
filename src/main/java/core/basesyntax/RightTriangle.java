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
        StringBuilder triangleBuilder = new StringBuilder();
        triangleBuilder
                .append("Figure: ")
                .append(FigureTypes.RIGHTTRIANGLE)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, firstLeg: ")
                .append(firstLeg)
                .append(" units, secondLeg: ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(triangleBuilder);
    }
}
