package core.basesyntax.figures;

public class IsoscelesTrapezoid extends AbstractFigure {
    private int sideUp;
    private int sideDown;
    private int height;
    private String color;

    public IsoscelesTrapezoid(int sideUp, int sideDown, int height, String color) {
        setSideUp(sideUp);
        setSideDown(sideDown);
        setHeight(height);
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSideUp() {
        return sideUp;
    }

    public void setSideUp(int sideUp) {
        this.sideUp = sideUp;
    }

    public int getSideDown() {
        return sideDown;
    }

    public void setSideDown(int sideDown) {
        this.sideDown = sideDown;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String getSize() {
        return "sideUp: " + getSideUp() + " units, " + "sideDown: " + getSideDown() + " units, "
                + "height: " + getHeight() + " units, ";
    }

    @Override
    public double area() {
        return ((double) (sideUp + sideDown) / 2) * height;
    }
}
