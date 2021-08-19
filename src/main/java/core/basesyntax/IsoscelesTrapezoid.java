package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int botSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int botSide, int height) {
        this.topSide = topSide;
        this.botSide = botSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + botSide) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: IsoscelesTrapezoid, area: ")
                        .append(this.getArea())
                        .append(" sq.units, topSide: ")
                        .append(topSide)
                        .append(" units, botSide: ")
                        .append(botSide)
                        .append(" units, height: ")
                        .append(height)
                        .append(" units, color: ")
                        .append(this.getColor())
        );
    }
}
