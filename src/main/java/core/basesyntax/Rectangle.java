package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(Color color, double height, double width) {
        super(color, FigureType.RECTANGLE);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %f, color = %s, width = %f, height = %f\n",
                getFigureType().getValue(), calculateArea(), getColor(), width, height);
    }
}
