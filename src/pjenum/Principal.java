package pjenum;

enum nivel{
    Baixo, Médio, Alto;
}
        
public class Principal {
    
    //static String[] niveis = {"Baixo", "Médio", "Alto"};

    public static void main(String[] args) {
        
        nivel n = nivel.Baixo;
        
        //System.out.println(n);
        //System.out.println(niveis[1]);
        //System.out.println(niveis[2]);
        
        switch(n){
            case Baixo:
                System.out.println("Nivel baixo");
                break;
            case Médio:
                System.out.println("Nivel médio");
                break;
            case Alto:
                System.out.println("Nivel alto");
                break;
        }
    }
    
}
