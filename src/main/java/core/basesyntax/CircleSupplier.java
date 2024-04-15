package core.basesyntax;

public class CircleSupplier {

    private final int rad = 10;
    private final double area = Math.PI * rad * rad;
    private final Colors color = Colors.WHITE;

    public final void writeDefaultCircle() {
        System.out.println("Figure: Circle, area: " + area
                + " sq. units, " + "radius: " + rad + " units, color: " + color);
    }
}
