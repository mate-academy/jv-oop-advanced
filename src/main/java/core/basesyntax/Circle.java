package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    String nameOfFigure() {
        return "circle";
    }

    @Override
    void infoAboutFigure() {
        System.out.println(new StringBuilder().append("Figure: circle, area: ")
                .append(area()).append(" sq.units, radius: ")
                .append(getRadius()).append(" units, color: ").append(getColor()));
    }
}

