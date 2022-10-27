package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int bottom;

    public RightTriangle(String color, int height, int bottom) {
        super(color);
        this.height = height;
        this.bottom = bottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", volume: "
                + getVolume() + " sq.units, color: " + getColor() + ", height: " + getHeight()
                + ", bottom: " + getBottom());

    }

    @Override
    public double getVolume() {
        return (double) (height * bottom) / 2;
    }
}
