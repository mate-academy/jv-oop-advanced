package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / (double) height;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: IsoscelesTrapezoid, area: ")
                        .append(getArea())
                        .append(" sq.units, firstBase: ")
                        .append(firstBase)
                        .append(" units, secondBase: ")
                        .append(secondBase)
                        .append(" units, height: ")
                        .append(height)
                        .append(" units, color: ")
                        .append(getColor())
        );
    }
}
