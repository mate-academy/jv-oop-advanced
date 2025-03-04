package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;
    private double area;

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Rectangle; Width: " + width
                            + " units; Height: " + height
                            + " units; Area: " + area
                            + "sq. units; Color: "
                            + super.getColor());
    }
}
