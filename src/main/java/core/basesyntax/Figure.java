package core.basesyntax;

public abstract class Figure implements Area, Draw {
    private String color;

    Figure (String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
