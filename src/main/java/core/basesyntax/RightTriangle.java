package core.basesyntax;

public class RightTriangle extends Figure implements FigureArea {
    private final int catted1;
    private final int catted2;
    private final int hypotenuse;

    public RightTriangle(int catted1, int catted2, int hypotenuse, String color, String property) {
        setColor(color);
        setProperty(property);
        this.catted1 = catted1;
        this.catted2 = catted2;
        this.hypotenuse = hypotenuse;
        setPropertyLength(hypotenuse);
        areaCalculate();
    }

    @Override
    public void areaCalculate() {
        setArea(0.5 * catted1 * catted2);
    }
}

