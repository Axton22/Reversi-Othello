package Clases;


public class GamePc  extends Player{
    
    public GamePc(String name, char sim,boolean starts) {
        super(name, sim, starts);

    }   

    @Override
    public char askMove(Board board) {
 CharacterList opcionesPc = new CharacterList();
    
    //busca las fichas disponibles pa jugar
    board.buscarTodasLasOpciones(opcionesPc);
    
    //resibe el total del contador
    int total = opcionesPc.recorrerlista(); 
    
    if (total > 0) {
        // generamos el número al azar basado en el total de la lista
        java.util.Random r = new java.util.Random();
        int indiceElegido = r.nextInt(total);
        
        // agarramos el carácter exacto de esa posición
        char fichaElegida = opcionesPc.obtenerFichaPorIndice(indiceElegido);
        
        System.out.println("La PC eligio el caracter: " + fichaElegida);
        return fichaElegida;
    }

    
    return ' '; 
}
}
    
    
    
 