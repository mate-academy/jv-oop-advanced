package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    
    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public void draw() {
        System.out.println(String.format("Figure: Circle, area: %.2f sq.units, "
                        + "radius: %d units, "
                        + "colour: %s",
                calculateArea(), radius, getColour()));
    }
}
