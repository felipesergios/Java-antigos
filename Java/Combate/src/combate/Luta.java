package combate;

import java.util.Random;

public class Luta {
 //Atributos
    private Lutador Desafiado;
    private Lutador Desafiante;
    private int Rounds;
    private boolean Aprovada;
    //public metodos
public void MarcarLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria().equals(l2.getCategoria())
            && l1 != l2){
        this.Aprovada = true;
        this.Desafiado = l1;
        this.Desafiante = l2;
        
    }else{
        this.Aprovada = false;
        this.Desafiado = null;
        this.Desafiante = null;
    }
    
}    
public void Lutar(){
    if(this.Aprovada){
        System.out.println("##DESAFIADO##");
     this.Desafiado.apresentar();
     System.out.println("##DESAFIANTE##");
     this.Desafiante.apresentar();
     Random G = new Random();
     int vencedor = G.nextInt(3);
     switch(vencedor){
         case 0:
             System.out.println("EMPATE NEGADA");
             Desafiado.empatarLuta();
             Desafiante.empatarLuta();
             break;
         case 1:
             System.out.println("VENCEU O SR "+this.Desafiado.getNome());
             Desafiado.ganharLuta();
             Desafiante.perderLuta();
             break;
         case 2:
             System.out.println("O "+this.Desafiante.getNome()+"Venceu Essa Luta!");
             Desafiante.empatarLuta();
             Desafiado.perderLuta();
             break;
     }
    }else{
        System.out.println("A Luta não pode Acontecer ");
    }
    
}
//Métodos Especiais

    public Lutador getDesafiado() {
        return Desafiado;
    }

    public void setDesafiado(Lutador Desafiado) {
        this.Desafiado = Desafiado;
    }

    public Lutador getDesafiante() {
        return Desafiante;
    }

    public void setDesafiante(Lutador Desafiante) {
        this.Desafiante = Desafiante;
    }

    public int getRounds() {
        return Rounds;
    }

    public void setRounds(int Rounds) {
        this.Rounds = Rounds;
    }

    public boolean isAprovada() {
        return Aprovada;
    }

    public void setAprovada(boolean Aprovada) {
        this.Aprovada = Aprovada;
    }

}
