package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int sideEdge;
    private final int topSide;
    private final int downSide;

    public IsoscelesTrapezoid(String color, int sideEdge, int topSide, int downSide) {
        this.color = color;
        this.sideEdge = sideEdge;
        this.topSide = topSide;
        this.downSide = downSide;
        this.area = ((topSide * downSide) / 2) * sideEdge;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + area
                + " sq.units, sideEdge: " + sideEdge
                + " units, topSide: " + topSide
                + " units, downSide: " + downSide
                + " units, color: " + color);
    }
}
