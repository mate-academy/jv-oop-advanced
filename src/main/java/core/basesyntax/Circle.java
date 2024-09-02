package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.typeOfFigure = TypeOfFigure.CIRCLE;
        this.area = getCircleArea(radius);
        this.radius = radius;
    }

    public double getCircleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + typeOfFigure
                           + ", area: " + decimalFormat.format(area) + " sq. units, radius:  "
                           + decimalFormat.format(radius) + " units, color: " + color);
    }
}
