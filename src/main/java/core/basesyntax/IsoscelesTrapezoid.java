package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topSide;
    private final int bottomSide;

    public IsoscelesTrapezoid(String color, int height, int topSide, int bottomSide) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder("Figure: ");
        str.append("isosceles trapezoid").append(", ")
                .append("area: ").append(((topSide + bottomSide) / 2) * height).append(" sq.units, ")
                .append("height: ").append(height).append(" units, ")
                .append("topSide: ").append(topSide).append(" units, ")
                .append("bottomSide: ").append(bottomSide).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(str.toString());
    }
}
