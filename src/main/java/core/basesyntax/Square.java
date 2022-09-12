package core.basesyntax;

public class Square extends Figure {
    private float side = getSomething();

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public StringBuilder printInfo() {
        setName("square");
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append(getName()).append(", ")
                .append("area: ").append(getArea())
                .append(" sq.units, side: ").append(side)
                .append(" units, color: ").append(getColor());
        System.out.println(sb);
        return sb;
    }
}
