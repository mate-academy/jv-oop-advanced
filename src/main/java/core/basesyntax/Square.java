package core.basesyntax;

public class Square extends Figure {

    public Square(Color color, int unit) {
        super(color, unit);
        this.name = "square";
    }

    @Override
    protected double getArea() {
        return unit * unit;
    }

    @Override
    protected String getSpecificParams() {
        return "side: " + unit + " units";
    }

}

