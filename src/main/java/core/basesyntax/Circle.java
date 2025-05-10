package core.basesyntax;

public class Circle extends ColorFigure {
    private double radiusSquare;

    public Circle(String color, double radiusSquare) {
        super(color);
        this.radiusSquare = radiusSquare;
    }

    public double getRadiusSquare() {
        return radiusSquare;
    }

    public void setRadiusSquare(double radiusSquare) {
        this.radiusSquare = radiusSquare;
    }

    @Override
    public void draw() {
        System.out.println("Figure: , circle:  "
                + getArea() + " sq. units, " + "radiusSquare: "
                + radiusSquare + " units, color: " + getColor());
    }

    public double getArea() {
        return Math.PI * (radiusSquare * radiusSquare);
    }
}
