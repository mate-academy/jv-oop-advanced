package core.basesyntax.figures;

public class RightTriangle extends Figure{
    private double bottom;
    private double altitude;

    public RightTriangle(String color, double bottom, double altitude) {
        super(color);
        this.bottom = bottom;
        this.altitude = altitude;
    }

    @Override
    public double getArea() {
        return bottom * altitude / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("This is a "
                + this.getColor()
                + " rectangle with bottom side = " + bottom + " cm "
                + " rectangle with altitude = " + altitude + " cm "
                + " and area " + this.getArea() + " square cm"
        );
    }
}
