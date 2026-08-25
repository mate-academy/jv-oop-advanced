package core.basesyntax.figure;

public abstract class FigureWithHeight extends Figure {
    private final double height;

    public FigureWithHeight(String color, double height) {
        super(color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
