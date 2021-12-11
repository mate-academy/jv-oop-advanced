package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Colors color,int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {

        final double Pi = 3.1415926536;
        return (Pi * radius * radius);
    }

    @Override
    public void draw() {
        StringBuilder outtext = new StringBuilder("");
        outtext.append("Figure: Circle , area: ");
        outtext.append(this.getArea());
        outtext.append(" sq.units");
        outtext.append(", radius: ").append(this.radius);
        outtext.append(", color: ").append(super.getBasecolor());
        System.out.println(outtext.toString());
    }
}
