
package poo;

public class Caneta {
    String Modelo;
    String Cor;
    float Ponta;
    int Carga;
    boolean Tampada;
    void status(){
        System.out.println("A Cor da caneta é "+this.Cor);
        System.out.println("a Ponta é "+this.Ponta);
        System.out.println("Esta Tampada? "+this.Tampada);
        System.out.println("CARGA >"+this.Carga);
    }
    void Rabiscar(){
        if(this.Tampada == true){
            System.out.println("IMPOSSIVEL !");
        }else{
            System.out.println("RABISCANDO>>");
        }
        
    }
    void Tampar(){
        this.Tampada = true;
    }
    void Destampar(){
        this.Tampada = false;
    }
}
