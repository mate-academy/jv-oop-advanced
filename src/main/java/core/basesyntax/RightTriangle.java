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
        StringBuilder outtext = new StringBuilder("");
        outtext.append("Figure: RightTriangle , area: ");
        outtext.append(this.getArea());
        outtext.append(" sq.units");
        outtext.append(", firstleg: ").append(this.firstleg);
        outtext.append(", secondleg: ").append(this.secondleg);
        outtext.append(", color: ").append(super.getBasecolor());
        System.out.println(outtext.toString());
    }
}
