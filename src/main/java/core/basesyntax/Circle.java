package core.basesyntax;

public class Circle extends Figure implements Drawable, AreaCalculator {
    private double radius;
    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String figureType() {
        return "Circle";
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + figureType() +  "area: " + getArea() + "sq.units, " + "radius: "
                + radius + " units, color: " + Co firstLeg: 7 units, secondLeg: 5 units, color: yellow);
    }
}
