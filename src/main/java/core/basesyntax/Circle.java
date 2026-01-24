package core.basesyntax;

public class Circle extends Figure {
    private String unitName = "radius";

    public Circle(Color color, int unit) {
        super(color, unit);
        this.name = "circle";
    }


    @Override
    protected double getArea() {
        return 0;
    }

    @Override
    protected String getSpecificParams() {
        return "";
    }

}
