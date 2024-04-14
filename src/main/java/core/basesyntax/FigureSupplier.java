package core.basesyntax;

public class FigureSupplier extends Circle {

    private final int rad = 10;
    private final double area = Math.PI * rad * rad;
    private final String color = Colors.WHITE.toString();

    public final void getDefaultFigure() {
        System.out.println("Figure: Circle, area: " + area
                + " sq. units, " + "radius: " + rad + " units, color: " + color);
    }
}
