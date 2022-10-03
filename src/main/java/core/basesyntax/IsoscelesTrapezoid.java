package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int side1;
    private final int side2;
    private final int height;
    private String color = super.getColor();

    public IsoscelesTrapezoid(int side1, int side2, int height, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) ((side1 + side2) / 2) * height;
    }

    @Override
    public String getInfo() {
        return "Figure : IsoscelesTrapezoid, Color : " + color
                + ", Side1 : " + side1
                + ", Side2 : " + side2
                + ", Height : " + height
                + ", Area : " + getArea();
    }
}
