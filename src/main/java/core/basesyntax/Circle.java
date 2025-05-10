package core.basesyntax;

public class Circle extends FigureSupplier implements BehaviourFigures {
    private double radius;

    Circle() {
        this.radius = 10;
        this.setName("Circle");
        this.radius = 10;
        this.setColor(Color.WHITE);
    }

    @Override
    public Figure getRandomFigure() {
        Figure circle = new Figure();
        circle.setArea(Math.pow(radius * Math.PI, 2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ").append(this.getName()).append(", area: ")
                .append(circle.getArea()).append(" sq.units, radius: ").append(radius)
                .append(" units, color: ")
                .append(getColor());
        circle.setText(stringBuilder.toString());
        return circle;
    }
}
