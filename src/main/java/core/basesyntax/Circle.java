package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String nameFigure, int radius, String colour) {
        this.radius = radius;
        this.setNameFigure(nameFigure);
        this.setColour(colour);
    }

    private static double round(double value) {
        int scale = (int) Math.pow(10, 1);
        return (double) Math.round(value * scale) / scale;
    }

    @Override
    public void draw() {

        System.out.println("Figure: " + this.getNameFigure()
                + ", area: " + round(Math.PI * radius * radius)
                + " sq.units, radius: " + radius
                + " units, color: " + this.getColour());
    }
}
