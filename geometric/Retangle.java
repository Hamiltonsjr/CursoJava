package entidades;

public class Retangle {

    public double width;
    public double height;

    public double valueArea(){
        return width * height;
    }
    public double perimeter(){
        return (width + height) * 2;
    }
    public double diagonal(){
        return Math.sqrt(width * height + width * height);
    }
    public String toString(){
        return "Valor da Aréa: " + valueArea() +
                "Valor do Perímetro: " + perimeter()+
                "Valor Diagonal: " + diagonal();

    }
}
