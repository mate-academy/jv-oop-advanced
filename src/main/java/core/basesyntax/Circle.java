package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        this.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: circle, area: ")
                .append(getArea()).append(" sq.units, radius: ")
                .append(radius).append(" units, color: ")
                .append(getColor());
        System.out.println(info);
    }

    @Override
    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int radius = figureSupplier.getRandomSideLength();
        return new Circle(color, radius);
    }
}
