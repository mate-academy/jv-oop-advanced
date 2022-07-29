package core.basesyntax;

public class RightTriangle extends Figure {
    private int akatet;
    private int bkatet;

    public RightTriangle(int akatet, int bkatet) {
        this.akatet = akatet;
        this.bkatet = bkatet;
    }

    public RightTriangle() {
    }

    @Override
    public double getArea() {
        return (double) akatet * bkatet / 2;
    }

    public void getInfo() {
        System.out.println("Figure: right triangle, area: " + String.format("%.1f", getArea())
                + " sq.units, katetA: "
                + akatet + "  units, katetB " + bkatet + "  units, color: " + super.getColor());
    }

}
