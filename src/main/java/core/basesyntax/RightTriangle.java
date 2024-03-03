package core.basesyntax;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int opposite;
    private int adjacent;

    public RightTriangle() {
    }

    public RightTriangle(int hypotenuse, int opposite, int adjacent, Color color) {
        this.hypotenuse = hypotenuse;
        this.opposite = opposite;
        this.adjacent = adjacent;
        this.color = color;
    }

    public double getArea() {
        return (double)opposite * adjacent / 2;
    }

    public void draw() {
        System.out.println("Figure: right triangle, " + "area: " + getArea()
                + " sq. units, hypotenuse: "
                + hypotenuse + " units, opposite: " + opposite + " units, adjacent: "
                + adjacent + " units, color: " + color);
    }
}
