package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private int firstCathetus;
    private int secondCathetus;

    public RightTriangle(String color, int firstCathetus, int secondCathetus) {
        super(color);
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
    }

    public int getLegA() {
        return firstCathetus;
    }

    public void setLegA(int legA) {
        this.firstCathetus = legA;
    }

    public int getLegB() {
        return secondCathetus;
    }

    public void setLegB(int legB) {
        this.secondCathetus = legB;
    }

    @Override
    public double getArea() {
        return (double) (firstCathetus * secondCathetus / 2);
    }

    @Override
    public String getInformation() {
        return "Figure: right triangle, area: " + new DecimalFormat("#.##").format(getArea())
                + " sq.units, legA: " + firstCathetus + " units, legB " + secondCathetus
                + " units, color: " + getColor();
    }
}
