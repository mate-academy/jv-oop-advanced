package core.basesyntax;

abstract class FigureAbstract {
   private String color;
public FigureAbstract(String color) {
    this.color = color;
}
    public String getColor() {
        return color;
    }
   public abstract double getArea();


}
