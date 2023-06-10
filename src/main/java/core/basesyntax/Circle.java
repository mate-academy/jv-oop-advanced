package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    
    public double getCountSquare() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        String circlePrint = "Figure: circle, area: " + getCountSquare()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor();
        System.out.println(circlePrint);
    }
}
