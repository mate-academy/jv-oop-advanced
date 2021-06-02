package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        super.title = "circle";
        super.color = new ColorSupplier().getRandomColor();
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(super.title)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(this.radius)
                .append(" units, color: ")
                .append(super.color);
        System.out.println(drawBuilder.toString());
    }
}
