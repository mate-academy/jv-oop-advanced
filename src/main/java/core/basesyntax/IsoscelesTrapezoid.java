package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double topSide, double downSide, double height) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (topSide + downSide) * height / 2;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append("rectangle, ")
                .append("area: ")
                .append(calculateArea())
                .append(" sq. units,")
                .append(" topSide: ")
                .append(topSide)
                .append(" units,")
                .append(" downSide: ")
                .append(downSide)
                .append(" units,")
                .append(" height: ")
                .append(height)
                .append(" units,")
                .append(" color: ")
                .append(getColor().name());

        System.out.println(sb);
    }
}
