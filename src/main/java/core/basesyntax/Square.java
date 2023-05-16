package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements FigureBehaviour {

    private int side;
    private final Random random = new Random();
    private final int MAXSIDE = 100;

    public Square() {
        this.setName("square");
    }
    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double obtainArea() {
       return side*side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append(", area: ");
        builder.append(String.format("%.2f", this.obtainArea()));
        builder.append(" sq.units,");
        builder.append(" side: ");
        builder.append(this.getSide());
        builder.append(" units");
        builder.append(" color: ");
        builder.append(this.getColor());
        System.out.println(builder.toString());

    }
}
