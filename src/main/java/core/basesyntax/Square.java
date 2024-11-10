package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        setFigure(FigureType.SQUARE);
        setSide(side);
        setColor(color);
        double area = getCalculatedArea();
        setArea(area);
    }

    public Square() {
        setFigure(FigureType.SQUARE);
        setSide(2);
        setColor(Color.BLUE);
        double area = getCalculatedArea();
        setArea(area);
    }

    @Override
    public double getCalculatedArea() {
        return side * side;
    }

    @Override
    public void drawDetails() {
        System.out.println(
                String.format("Figure: %s, area: %s sq.units, side: %s units, color: %s",
                getFigure().toLowerCase(),
                getArea(),
                getSide(),
                getColor().toString().toLowerCase())
        );
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }
}
