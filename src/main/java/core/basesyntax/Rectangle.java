package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int weight;

    public Rectangle(String color, int height, int weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder("Figure: ");
        str.append("rectangle").append(", ")
                .append("area: ").append(height * weight).append(" sq.units, ")
                .append("height: ").append(height).append(" units, ")
                .append("weight: ").append(weight).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(str.toString());
    }
}
