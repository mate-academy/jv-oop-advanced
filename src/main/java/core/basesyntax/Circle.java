package core.basesyntax;

public class Circle extends Figure {

    public Circle(Color color, int unit) {
        super(color, unit);
        this.name = "circle";
    }


    @Override
    protected double getArea() {
        return Math.PI * unit * unit;
    }

    @Override
    protected String getSpecificParams() {
        return "radius: " + unit + " units";
    }

}
