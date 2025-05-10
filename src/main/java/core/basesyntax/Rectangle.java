package core.basesyntax;

public class Rectangle extends Figure {
    protected static final String type = "rectangle";
    protected double width;
    protected double height;
    
    public Rectangle(String color, double width, double height, String type) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        this(color, width, height, "rectangle");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    protected String getAdditionalInfo() {
        return "width: " + width + " units , height: " + height + " units";
    }
}
