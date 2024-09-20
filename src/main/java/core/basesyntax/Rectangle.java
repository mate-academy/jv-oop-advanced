package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color, width * height);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %f, width: %f, height: %f, color: %s\n",
                area,
                width,
                height,
                color
        );
    }
}
