public abstract class Figure implements AreaCalculator, FigureSketch{

    private String color;
    private String figureType;

    public Figure(String color,String figureType) {
        this.color = color;
        this.figureType = figureType;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType() {
        this.figureType = figureType;
    }

}
