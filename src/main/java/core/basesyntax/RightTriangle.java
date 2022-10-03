package core.basesyntax;

//import java.util.Random;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle() {
    }

    public RightTriangle(Color color, int leg1, int leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public float getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String info = "Figure: right triangle, area :" + getArea() + "sq. units, leg1: " + leg1
                + " units, leg2: " + leg2 + " units, color: " + getColor().name();
        System.out.println(info);
    }

    /*@Override
    public Figure buildFigure() {
        super.setColor(ColorSupplier.getRandomColor());
        int leg1 = new Random().nextInt(LENGTH_LIMIT);
        int leg2 = new Random().nextInt(LENGTH_LIMIT);
        return new RightTriangle(super.getColor(), leg1, leg2);
    }*/
}
