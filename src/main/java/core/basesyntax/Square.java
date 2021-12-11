package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(Colors color, int side) {

        super(color);
        this.side = side;

    }

    @Override
    public double getArea() {

        return (side * side);

    }

    @Override
    public void draw() {
        StringBuilder outtext = new StringBuilder("");
        outtext.append("Figure: Square , area: ");
        outtext.append(this.getArea());
        outtext.append(" sq.units");
        outtext.append(", side: ").append(this.side);
        outtext.append(", color: ").append(super.getBasecolor());
        System.out.println(outtext.toString());
    }
}
