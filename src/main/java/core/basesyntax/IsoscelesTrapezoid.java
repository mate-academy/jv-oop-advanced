package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int heigh;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int heigh, Color color) {
        this.color = color;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.heigh = heigh;
    }

    @Override
    public double getArea() {
        return (double)(firstBase + secondBase) * heigh / 2.0;
    }

    @Override
    public String getDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: trapezoid, area: ")
                .append(getArea()).append(" sq. units, firstbase: ")
                .append(firstBase)
                .append(" units, secondbase: ")
                .append(secondBase)
                .append(" units, heigh: ")
                .append(heigh)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }
}
