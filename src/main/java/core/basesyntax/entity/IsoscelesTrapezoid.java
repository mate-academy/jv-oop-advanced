package core.basesyntax.entity;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int aboveBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int aboveBase, int bottomBase, int height) {
        super(color);
        this.aboveBase = aboveBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((aboveBase + bottomBase) * height) / 2;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: right triangle, ");
        stringBuilder.append("area: ")
                .append(Math.round(getArea() * 10.0) / 10.0).append(" sq. units, ")
                .append("aboveBase: ").append(aboveBase).append(" units, ")
                .append("bottomBase: ").append(bottomBase).append(" units, ")
                .append("height: ").append(height).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
