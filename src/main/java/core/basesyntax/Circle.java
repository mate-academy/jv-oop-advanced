package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Draw {
    private double radius;
    private String color;

    @Override
    public void setParameters(int sideA,int sideB,int height,int firstLeg,
                           int secondLeg,int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return color;
    }

    @Override
    public String behaviour() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + draw();
    }
}
