package core.basesyntax;

public class RightTriangle extends Figure {
    private float firstLeg = getSomething();

    private float secondLeg = new FigureSupplier().getRandomFigure();

    @Override
    public float getArea() {
        return (float) (secondLeg * firstLeg * 0.5);
    }

    @Override
    public StringBuilder printInfo() {
        setName("right triangle");
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append(getName()).append(", ")
                .append("area: ").append(getArea())
                .append(" rg.units, firsts leg: ").append(firstLeg)
                .append(" units, second leg: ").append(secondLeg)
                .append(" units, color: ").append(getColor());
        System.out.println(sb);
        return sb;
    }
}
