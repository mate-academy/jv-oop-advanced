package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        setFigureName("circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return Math.PI * radius * radius;
    }

    public void getInfo() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getFigureArea()
                + " sq. units, radius: " + getRadius()
                + " unit(s), color: " + getFigureColor());
    }
}
