package First;

public class Retangulo {
    float altura, largura;

    //Construtor
    Retangulo( float al, float la){
        altura = al;
        largura = la;
    }

    float calcularArea(){
        return altura * largura;
    }

    float calcularPerimetro(){
        return  2 * altura + 2 * largura;
    }

}
