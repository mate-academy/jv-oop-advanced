package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;
    
    public Rectangle(String colour, int width, int height) {
        super(colour);
        this.height = height;
        this.width = width;
        
        setArea(calculateArea());
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public void draw() {
        System.out.println(String.format("FFigure: Rectangle, area: %.2f sq.units, "
                        + "height: %d units, "
                        + "width: %d units, "
                        + "colour: %s",
                calculateArea(), height, width, getColour()));
    }
}
