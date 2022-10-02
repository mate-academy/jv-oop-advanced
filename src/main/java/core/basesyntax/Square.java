package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        float area = side * side;
        return area;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String figureInfo = "Figure: square, area :" + getArea() + "sq. units, side: " + side
                + " units, color: " + getColor().name();
        System.out.println(figureInfo);
    }
}
