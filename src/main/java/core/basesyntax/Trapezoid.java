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

        StringBuilder outtext = new StringBuilder("");
        outtext.append("Figure: Trapezoid , area: ");
        outtext.append(this.getArea());
        outtext.append(" sq.units");
        outtext.append(", basefirst: ").append(this.basefirst);
        outtext.append(", basesecond: ").append(this.basesecond);
        outtext.append(", height: ").append(this.height);
        outtext.append(", color: ").append(super.getBasecolor());
        System.out.println(outtext.toString());
    }
}
