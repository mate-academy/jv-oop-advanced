package core.basesyntax;

public class Circle implements Behavior {
    private double radius;
    private String state;

    public Circle(String state, double radius) {
        this.radius = radius;
        this.state = state;
    }
    @Override
    public void creatFigure() {
        double a = Math.PI * (radius * radius);
        double rounded = Math.round(a * 100.0) / 100.0;
        System.out.println("Figure: circle, area: " + rounded + " sq. units, radius: " + radius +" units, color: " + state);
    }
}
