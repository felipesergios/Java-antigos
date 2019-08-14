
package combate;
public class Combate {
    public static void main(String[] args) {
    Lutador L[] = new Lutador[6];
        L[0]=new Lutador("Sr Bilada","BRAZUCAS",24,1.80f,68.9f,11,2,1);
    L[0].apresentar();
    L[0].status();
    L[1]=new Lutador("MR.KATRA","EUA ",38,1.75f,58.5f,40,0,1);
    L[1].apresentar();
    L[1].status();
    Luta BIR=new Luta();
    BIR.MarcarLuta(L[0], L[1]);
    BIR.Lutar();
    
    }
    
}
