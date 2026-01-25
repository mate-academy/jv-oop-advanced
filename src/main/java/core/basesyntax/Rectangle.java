package core.basesyntax;

public class Rectangle extends Figure {
    public Rectangle(Color color, int value1, int value2) {
        super(color, value1, value2);
        this.name = "rectangle";
        this.parameters = new String[]{"height", "width"};
    }

    @Override
    protected double getArea() {
        int height = values[0];
        int width = values[1];
        return height * width;
    }

    @Override
    protected String valuesFormat() {
        return parameters[0] + ": " + values[0] + " units"
                + ", "
                + parameters[1] + ": " + values[1] + " units";
    }
}
