package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;
    private double diagonal;

    public Rectangle(String color, double width,
                     double height) {
        super(color);
        this.width = width;
        this.height = height;
        this.diagonal = Math.sqrt(width * width + height * height);;

    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + "sq. units, width: " + width
                + " units, height: " + height
                + " units, diagonal: " + diagonal + "units, color: " + getColor());
    }
}
