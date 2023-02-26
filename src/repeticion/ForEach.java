package repeticion;

public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"pepe","juan", "carlos"};

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        int [] numeros = {1,2,5,7,9};

        int suma = 0;
        for(int numero : numeros){
            suma += numero;
        }
            System.out.println(suma);

        }
}
