package epsi.software.formes.models;

public class Square extends ShapeAbs{

    private String symbol = "*";

    public Square(){

    }
    public Square(int number){
        setNumber(number);
    }
    @Override
    public void display() {
        for (int i = 0; i < getNumber(); i++) {
            for (int j = 0; j < getNumber(); j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
