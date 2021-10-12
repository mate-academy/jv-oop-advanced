package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomSide;
    private final int topSide;
    private final int height;

    public IsoscelesTrapezoid(String name, int bottomSide, int topSide, int height, String colour) {
        this.setNameFigure(name);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
        this.setColour(colour);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getNameFigure()
                + ", area: " + (topSide + bottomSide) * height * 0.5
                + " sq.units, height: " + height
                + " units, bottomSide: " + bottomSide
                + " units, topSide: " + topSide
                + " units, color: " + this.getColour());
    }
}

