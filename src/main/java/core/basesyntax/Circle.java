package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String circleColor;

    public Circle(double radius, String circleColor) {
        this.radius = radius;
        this.circleColor = circleColor;
    }

    @Override
    public double calculateArea() {
        double circleArea = Math.PI * Math.pow(radius, 2);
        circleArea = (double) Math.round(circleArea * 100) / 100;
        return circleArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + Circle.class.getSimpleName()
                + ", area: " + calculateArea()
                + " sq.units, radius: " + radius + " units"
                + ", color: " + circleColor);
    }
}
