package core.basesyntax;

public class Trapezoid extends Figure {

    private int basefirst;
    private int basesecond;
    private int height;

    public Trapezoid(Colors color,int basefirst,int basesecond,int height) {
        super(color);
        this.basefirst = basefirst;
        this.basesecond = basesecond;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((basefirst + basesecond) / 2) * height;
    }

    @Override
    public void draw() {

        String outtext = "Figure: Trapezoid , area: "
                + this.getArea() + " sq.units"
                + ", basefirst: " + this.basefirst
                + ", basesecond: " + this.basesecond
                + ", height: " + this.height
                + ", color: " + super.getBasecolor();
        System.out.println(outtext);

    }
}
