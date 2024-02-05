package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    //counting area of circle
    @Override
    public double countArea(Figure figure) {
        return area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printInfo(Figure figure) {
        System.out.println("Figure: circle, " + "area: " + figure.countArea(figure)
                + " sq.units, " + "radius: " + radius + " degrees, "
                + "color: " + figure.getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
