package core.basesyntax;

public class Rectangle extends Figure implements FigureDrawer {
    private double height;
    private double weight;

    public Rectangle(String nameFigure, int height, int weight, String colour) {
        this.setNameFigure(nameFigure);
        this.height = height;
        this.weight = weight;
        this.setColour(colour);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getNameFigure()
                + ", area: " + height * weight
                + " sq.units, height: " + height
                + " sq.units, weight: " + weight
                + " units, color: " + this.getColour());
    }
}
