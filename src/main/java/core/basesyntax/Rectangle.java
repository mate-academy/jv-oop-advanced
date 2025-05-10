package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(getClass().getSimpleName())
                .append(", area: ").append(getArea()).append(" sq.units, side a: ")
                .append(sideA).append(" units,  side b: ")
                .append(sideB).append(" units, color: ").append(getColor()).toString();
        System.out.println(sb);
    }
}
