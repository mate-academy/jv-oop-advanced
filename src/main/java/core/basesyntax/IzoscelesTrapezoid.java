package core.basesyntax;

public class IzoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int height;
    private double side;

    public IzoscelesTrapezoid(int bottom, int top, int height, Color color) {
        super((top + bottom) * height / 2, color);
        this.bottom = bottom;
        this.top = top;
        this.height = height;
        setSide();
    }

    private void setSide() {
        side = Math.sqrt(Math.pow(height, 2) + Math.pow(Math.abs((bottom - top) / 2), 2));
    }

    public void printInfo() {
        System.out.println("Shape: izosceles trapezoid, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor());
    }
}
