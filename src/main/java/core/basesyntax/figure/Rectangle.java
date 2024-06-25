package core.basesyntax.figure;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println(getDescription());
    }

    @Override
    public String getDescription() {
        return "Figure: rectangle, area: "
                + getArea()
                + " sq. units, width: "
                + width
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }
}
