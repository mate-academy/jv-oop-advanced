package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float firstSide = getSomething() - 3;

    private float secondSide = new FigureSupplier().getRandomFigure() - 3;

    private float height = (firstSide + secondSide) / 2;

    @Override
    public float getArea() {
        return (firstSide * secondSide / 2) * height;
    }

    @Override
    public StringBuilder printInfo() {
        setName("isosceles trapezoid");
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append(getName()).append(", ")
                .append("area: ").append(getArea())
                .append(" iss.units, firsts side: ").append(firstSide)
                .append(" units, second side: ").append(secondSide)
                .append(" units, height: ").append(height)
                .append(" units, color: ").append(getColor());
        System.out.println(sb);
        return sb;
    }
}
