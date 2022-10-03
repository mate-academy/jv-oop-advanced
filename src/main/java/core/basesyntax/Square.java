package core.basesyntax;

//import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String figureInfo = "Figure: square, area :" + getArea() + "sq. units, side: " + side
                + " units, color: " + getColor().name();
        System.out.println(figureInfo);
    }

    /*@Override
    public Figure buildFigure() {
        super.setColor(ColorSupplier.getRandomColor());
        int side = new Random().nextInt(LENGTH_LIMIT);
        return new Square(super.getColor(), side);
    }*/

}
