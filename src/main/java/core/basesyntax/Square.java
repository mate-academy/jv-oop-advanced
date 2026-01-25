package core.basesyntax;

public class Square extends Figure {

    public Square(Color color, int side) {
        super(color, side);
        this.name = "square";
        this.parameters = new String[]{"side"};
    }

    @Override
    protected double getArea() {
        int side = values[0];
        return side * side;
    }

    @Override
    protected String valuesFormat() {
        return parameters[0] + ": " + values[0] + " units";
    }

}

