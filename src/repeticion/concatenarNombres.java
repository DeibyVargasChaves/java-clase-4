package repeticion;
public class concatenarNombres {
    public static void main(String[] args){

        String[] nombres = { "juan ", "pedro ", "carlos ", "mario"};
        String nombresList = " ";
        for ( int i = 0; i < nombres.length; i++ ) {
            nombresList += nombres[i];
            System.out.println(nombresList);

        }
    }
}
