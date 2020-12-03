package core.basesyntax;

public class Trapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    protected Trapezoid(int firstBase,int secondBase,int height, Color color) {
        super((firstBase + secondBase) / 2 * height, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    private int getHeight() {
        return height;
    }

    @Override
    public String draw() {
        return String.format("Figure:Trapezoid,Color:%s,Area:%s,Height:%d", getColor(),
                getArea(), getHeight());
    }

}
