package core.basesyntax;

public class IzoscelesTrapezoid extends Figures {
    private int bottom;
    private int top;
    private int height;
    private double side;

    public void setParameters(int bottom, int top, int height) {
        this.bottom = bottom;
        this.top = top;
        this.height = height;
        this.side = Math.sqrt(Math.pow(height, 2) + Math.pow(Math.abs((bottom - top) / 2), 2));
    }

    public void setArea() {
        super.setArea((top + bottom) * height / 2);
    }

    public void printInfo() {
        System.out.println("Shape: izosceles trapezoid, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor());
    }
}
