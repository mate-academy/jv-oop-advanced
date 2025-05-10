package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int sideEdge;
    private final int topSide;
    private final int downSide;

    public IsoscelesTrapezoid(String color, int topSide, int downSide, int sideEdge) {
        this.color = color;
        this.sideEdge = sideEdge;
        this.topSide = topSide;
        this.downSide = downSide;
        this.area = calculateArea(topSide, downSide, sideEdge);
    }

    protected int calculateArea(int topSide, int downSide, int sideEdge) {
        int halfPerimeter = (topSide + downSide + sideEdge) / 2;
        int x = (halfPerimeter - topSide)
                * (halfPerimeter - downSide)
                * (halfPerimeter - sideEdge)
                * (halfPerimeter - sideEdge);
        return (int) Math.sqrt(x);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + area
                + " sq.units, sideEdge: " + sideEdge
                + " units, topSide: " + topSide
                + " units, downSide: " + downSide
                + " units, color: " + color);
    }
}
