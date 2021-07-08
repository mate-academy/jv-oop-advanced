package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private final static String FIGURE_NAME = "Circle";
    private double circleArea;
    private String circleColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void chooseFigureColor(int randomColorNumber) {
        ColorSupplier colorSupplier = new ColorSupplier(randomColorNumber);
        circleColor = colorSupplier.getRandomColor();
    }

    @Override
    public double calculateArea() {
        circleArea = Math.PI * Math.pow(radius, 2);
        circleArea = (double) Math.round(circleArea * 100) / 100;
        return circleArea;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FIGURE_NAME +
                ", area: " + circleArea +
                " sq.units, radius: " + radius + " units" +
                ", color: " + circleColor);
    }
}
