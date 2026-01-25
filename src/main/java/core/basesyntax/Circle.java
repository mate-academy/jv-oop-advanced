package core.basesyntax;

public class Circle extends Figure {

    public Circle(Color color, int radius) {
        super(color, radius);
        this.name = "circle";
        this.parameters = new String[]{"radius"};
    }
    
    @Override
    protected double getArea() {
        int radius = values[0];
        return Math.PI * radius * radius;
    }

    @Override
    protected String valuesFormat() {
        return parameters[0] + ": " + values[0] + " units";
    }

}
