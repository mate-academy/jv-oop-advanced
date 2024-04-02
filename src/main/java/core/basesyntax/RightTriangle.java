package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int heigh;

    public RightTriangle(int base, int heigh) {
        this.base = base;
        this.heigh = heigh;
    }

    public RightTriangle(int base, int heigh, String color) {
        this.base = base;
        this.heigh = heigh;
        super.color = color;
    }

    @Override
    public double getFigureArea() {
        return (base * heigh) / 2;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: RightTriangle, area: " + getFigureArea() + " sq. units, base: "
                + base + " heigh " + heigh + " units, color: " + super.color;
    }
    /* Wzór na pole trójkąta prostokątnego (a*h)/2 */
}
