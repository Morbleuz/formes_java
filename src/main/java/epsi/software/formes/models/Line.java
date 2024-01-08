package epsi.software.formes.models;

public class Line extends ShapeAbs{
    private String symbol = "*" ;
    public Line(){}
    public Line(int number){
        setNumber(number);
    }
    @Override
    public void display() {
        for (int i=0;i<getNumber();i++){
            System.out.print(symbol);
        }
        System.out.println("");
    }
}
