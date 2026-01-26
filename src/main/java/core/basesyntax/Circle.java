package core.basesyntax;

public class Circle extends Figure {

    public Circle(Color color, int radius) {
        super(color, radius);
        this.name = "circle";
        this.parameters = new String[]{"radius"};
    }
    
    @Override
    public double getArea() {
        int radius = values[0];
        return Math.PI * radius * radius;
    }
}
