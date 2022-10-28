package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upperSide;
    private int lowSide;

    public IsoscelesTrapezoid(String color, int height, int upperSide, int lowSide) {
        super(color);
        this.height = height;
        this.upperSide = upperSide;
        this.lowSide = lowSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public int getLowSide() {
        return lowSide;
    }

    public void setLowSide(int lowSide) {
        this.lowSide = lowSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, color: " + getColor() + ", height: " + height
                + ", upperSide: " + upperSide + ", lowSide: " + lowSide);

    }

    @Override
    public double getArea() {
        return ((upperSide * lowSide) * 0.5) * height;
    }
}
