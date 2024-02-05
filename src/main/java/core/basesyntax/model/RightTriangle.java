package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int opposite;
    private int adjacent;

    public RightTriangle(String name, String color, int opposite, int adjacent) {
        super(name, color);
        this.adjacent = adjacent;
        this.opposite = opposite;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Opposite: " + opposite
                + ", adjacent: " + adjacent);
    }

    @Override
    public double area() {
        return 0.5 * opposite * adjacent;
    }
}
