package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        setFigureName("Circle");
        System.out.println("Figure: " + getFigureName());
        setFigureArea(Math.PI * radius * radius);
        System.out.println("area: " + getFigureArea() + " sq. units");
        System.out.println("radius: " + radius + " units");
        System.out.println("color: " + getColor());
    }

}
