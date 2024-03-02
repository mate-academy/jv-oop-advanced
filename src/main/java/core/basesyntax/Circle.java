package core.basesyntax;

public class Circle extends Figure {
    private int radius = 15;
    private String color = Colors.RED.name();

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

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
