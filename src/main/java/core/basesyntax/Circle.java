package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    {
        figureType = FigureType.CIRCLE;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        getCircleArea();
    }

    private void getCircleArea() {
        area = Math.PI * Math.pow(radius,2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + figureType
                           + ", area: " + decimalFormat.format(area) + " sq. units, radius:  "
                           + decimalFormat.format(radius) + " units, color: " + color);
    }
}
