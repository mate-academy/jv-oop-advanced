package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + areaCalc()
                + " sq. units, radius: " + radius + " units, "
                + "color: " + getColor());
    }

    @Override
    public double areaCalc() {
        double area = (Math.PI * Math.pow(radius, 2));
        return getRound(area);
    }

}
