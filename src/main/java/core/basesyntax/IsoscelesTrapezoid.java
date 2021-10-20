package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Areacount {
    private int botbase;
    private int topbase;
    private int height;

    public IsoscelesTrapezoid(int botbase, int topbase, int height,String color) {
        this.botbase = botbase;
        this.topbase = topbase;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return 0.5 * (botbase + topbase) * height;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" + "area: " + getArea() + " || " + "color: " + getColor() + '}';
    }
}
