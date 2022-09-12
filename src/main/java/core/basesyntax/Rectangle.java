package core.basesyntax;

public class Rectangle extends Figure {
    private float firstSide = getSomething();

    private float secondSide = new FigureSupplier().getRandomFigure();

    @Override
    public float getArea() {
        return firstSide * secondSide;
    }

    @Override
    public StringBuilder printInfo() {
        setName("rectangle");
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append(getName()).append(", ")
                .append("area: ").append(getArea())
                .append(" rc.units, firsts side: ").append(firstSide)
                .append(" units, second side: ").append(secondSide)
                .append(" units, color: ").append(getColor());
        System.out.println(sb);
        return sb;
    }
}
