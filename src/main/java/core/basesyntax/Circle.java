package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        this.setArea(area);
        return area;
    }

    @Override
    public void paintFigure() {
        System.out.println("Figure : Circle, area : " + getArea() + ", radius : "
                + radius + ", color : " + color);
    }
}
