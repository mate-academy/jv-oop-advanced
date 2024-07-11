package core.basesyntax;

public class Square extends Rectangle {

    public Square(String color, double side) {
        super(color, side, side, "square");
    }
    
    @Override
    protected String getAdditionalInfo() {
        return "side: " + width + " units";
    }
}
