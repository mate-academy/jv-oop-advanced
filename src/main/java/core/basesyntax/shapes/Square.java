package core.basesyntax.shapes;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        String separator = ", ";
        sb.append(getClass().getSimpleName()).append(separator).append("area: ").append(area())
                .append(" sq.units").append(separator).append("side: ").append(side)
                .append(" units").append(separator).append("color: ").append(getColor());
        System.out.println(sb);
    }
}
