package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        StringBuilder str = new StringBuilder();
        str.append("Figure: ").append(this.FIGURE_NAME)
                .append(", area: ").append(this.getArea()).append(" sq.units, radius: ")
                .append(this.radius).append(" units, color: ").append(super.getColor()).toString();
        System.out.println(str);
    }
}
