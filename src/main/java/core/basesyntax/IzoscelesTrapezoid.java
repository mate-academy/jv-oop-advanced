package core.basesyntax;

public class IzoscelesTrapezoid extends Figures {
    int bottom;
    int top;
    int height;

    public IzoscelesTrapezoid(int bottom, int top, int height, String color) {
        super(Math.sqrt(Math.pow(height, 2) + Math.pow(Math.abs((bottom - top) / 2), 2)), color);
        this.bottom = bottom;
        this.top = top;
        this.height = height;
        setArea((top + bottom) * height / 2);
    }

    @Override
    public void print() {
        System.out.println("Shape: izosceles trapezoid, area: " + getArea()
                + " sq. units, side length: " + getUniqueParameter() + " units, color: "
                + getColor());
    }

}
