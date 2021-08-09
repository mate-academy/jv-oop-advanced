package core.basesyntax;


public class Circle extends Figure implements FigureDrawer {
    private double radius;

    public Circle(String nameFigure, int radius, String colour) {
        this.radius = radius;
        this.setNameFigure(nameFigure);
        this.setColour(colour);
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

    @Override
    public void draw() {

        System.out.println("Figure: " + this.getNameFigure()
                + ", area: " + round(Math.PI * radius * radius, 1)
                + " sq.units, radius: " + radius
                + " units, color: " + this.getColour());
    }
}

