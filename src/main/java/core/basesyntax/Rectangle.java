package core.basesyntax;

public class Rectangle extends Figure implements Drawable{

    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return round(2 * (width + height));
    }

    public double getArea() {
        return round(width * height);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle" +
                        ", width: " + width + " units" +
                        ", height: " + height + " units"+
                        ", area: " + getArea() +" sq. units"+
                        ", perimeter: " + getPerimeter() +" units"+
                        ", color: " + color
        );
    }
}
