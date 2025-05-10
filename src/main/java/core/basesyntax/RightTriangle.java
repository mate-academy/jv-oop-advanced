package core.basesyntax;

public class RightTriangle extends Figure {

    private int firstleg;
    private int secondleg;

    public RightTriangle(Colors color,int firstleg,int secondleg) {
        super(color);
        this.firstleg = firstleg;
        this.secondleg = secondleg;
    }

    @Override
    public double getArea() {

        return (firstleg * secondleg) / 2;
    }

    @Override
    public void draw() {
        String outtext = "Figure: RightTriangle , area: "
                + this.getArea() + " sq.units"
                + ", firstleg: " + this.firstleg
                + ", secondleg: " + this.secondleg
                + ", color: " + super.getBasecolor();
        System.out.println(outtext);
    }
}
