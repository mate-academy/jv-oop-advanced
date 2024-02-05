package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int opposite;
    private int adjacent;

    public RightTriangle(String name, int area, String color, int hyp, int opp, int adj) {
        super(name, area, color);
        this.hypotenuse = hyp;
        this.adjacent = adj;
        this.opposite = opp;
    }

    @Override
    public String toString() {
        return String.format("%s, hypotenuse: %d, opposite: %d, adjacent: %d",
                super.toString(), (int) hypotenuse, (int) opposite, (int) adjacent);
    }
}
