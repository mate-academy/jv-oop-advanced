package core.basesyntax;

//import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int lowerBase;
    private int upperBase;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(Color color, int height, int lowerBase, int upperBase) {
        super(color);
        this.height = height;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;

    }

    @Override
    public float getArea() {
        float area = (lowerBase + upperBase) / 2 * height;
        return area;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String figureInfo = "Figure: isosceless trapezoid, area :" + getArea()
                + "sq. units, height: " + height
                + " lower base : " + lowerBase + " units, upper base: "
                + upperBase + " units, color: " + getColor().name();
        System.out.println(figureInfo);
    }
    /*
    @Override
    public Figure buildFigure() {
        super.setColor(ColorSupplier.getRandomColor());
        int height = new Random().nextInt(LENGTH_LIMIT);
        int lowerBase = new Random().nextInt(LENGTH_LIMIT);
        int upperBase = new Random().nextInt(LENGTH_LIMIT);
        return new IsoscelesTrapezoid(super.getColor(), height, lowerBase, upperBase);
    }*/
}
