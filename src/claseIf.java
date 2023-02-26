public class claseIf {

    public static void main(String[] args) {

        int edad = 15;
        boolean esMayor = edad >= 18;

        if (esMayor){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }




        String dia = "jueves";

        switch (dia){
            case "lunes":
                System.out.println("Es lunes");
                break;
            case "martes":
                System.out.println("Es martes");
                break;
            case "miercoles":
                System.out.println("Es miercoles");
                break;
            case "jueves":
                System.out.println("Es jueves");
                break;
            case "viernes":
                System.out.println("Es viernes");
                break;
            case "sabado":
                System.out.println("Es sabado");
                break;
            default:
                System.out.println("No es un dia valido");
                break;
        }
    }
}
