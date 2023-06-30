package figure;

import tools.Color;

public class Circle extends Figure {

    private int radius = 0;

    public Circle(String name) {
        setName(name);
        randomFigure();
    }

    public Circle(String name, int radius, Color color) {
        setName(name);
        this.radius = radius;
        setColor(color);
        resultArea();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void resultArea() {
        setArea(2 * Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius + " units, "
                + "color: " + getColor());
    }

    @Override
    public void randomFigure() {
        super.randomFigure();
        this.radius = Figure.randomSideFigure();
        resultArea();
    }
}
