package entidades;// pacote da classe

public class Triangle { // nome da classe

    public double a;// atributos da classe , public indica que o atributo pode ser usado em outro arquivos
    public double b;
    public double c;

    public double area(){// sem paramêtros pq já tem a,b e c na classe
        double p = (a + b +c) - 2.0;
        return Math.sqrt(p * (p - a) * (p -b) * (p - c));
    }
}
