package core.basesyntax;

public abstract class Figure implements Area{
    private COLOR color;

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public Figure(COLOR color){
        this.color = color;
    }
}
