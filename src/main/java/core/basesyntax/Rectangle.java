package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getFigureName() {
        return "rectangle";
    }

    @Override
    public String getDetails() {
        return "width: " + width + " units," + ", height: " + height + " units";
    }
}
