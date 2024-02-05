package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int opposite;
    private int adjacent;

    public RightTriangle(String name, int area, String color, int hypotenuse, int opposite, int adjacent) {
        super(name, area, color);
        this.hypotenuse = hypotenuse;
        this.adjacent = adjacent;
        this.opposite = opposite;
    }

    @Override
    public String toString() {
        return super.toString() + ", hypotenuse: " + hypotenuse + ", opposite: " + opposite + ", adjacent: " + adjacent;
    }
}
