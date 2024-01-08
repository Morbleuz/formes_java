package epsi.software.formes.models;

public abstract class ShapeAbs {

    private Integer number = 5;
    public abstract void display ();

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

}
