package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double side;

    public IsoscelesTrapezoid(Color color, double lowerBase, double upperBase, double side) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    public IsoscelesTrapezoid(Color color) {
        super(color);
    }

    @Override
    public double square() {
        double t = (lowerBase + upperBase) / 2;
        return (t * Math.sqrt(Math.pow(side, 2) - (Math.pow(lowerBase - upperBase, 2) / 4)));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        String square = String.format("%.1f", square());
        builder.append("Figure: isoscelesTrapezoid, area: ").append(square).append(" sq.units, ");
        builder.append("lowerBase: ").append(lowerBase).append(" units, ");
        builder.append("upperBase: ").append(upperBase).append(" units, ");
        builder.append("side: ").append(side).append(" units, color: ").append(super.getColor());
        System.out.println(builder);
    }
}
