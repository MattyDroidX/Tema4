public class Main {
    public static void main(String[] args) {
        int numeroif = 4;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "Kosovo";


        System.out.println("********** IF STATEMENT ***************************");

        if (numeroif >= 0) {
            System.out.println("numeroif es positivo");
        }
        else if (numeroif == 0) {
            System.out.println("numeroif es cero");
        }
        else{
            System.out.println("numeroif es negativo");
        }

        System.out.println("********** WHILE STATEMENT ***************************");



       while (numeroWhile < 3) {
           System.out.println(numeroWhile);
           numeroWhile++;
       }

        System.out.println("********** DO/WHILE STATEMENT ***************************");



       do {
           System.out.println(numeroWhile);
           numeroWhile++;
       }while (numeroWhile < 0);


        System.out.println("********** FOR STATEMENT ***************************");



        for (int i = 0; i <= 3; i++) {
            System.out.println(numeroFor);
            numeroFor++;
        }

        System.out.println("********** SWITCH STATEMENT ***************************");



        switch (estacion) {
            case "Verano":
                System.out.println("Estacion Verano");
                break;
            case "Otonio":
                System.out.println("Estacion Otonio");
                break;
            case "Invierno":
                System.out.println("Estacion Invierno");
                break;
            case "Primavera":
                System.out.println("Estacion Primavera");
                break;
            default:
                System.out.println("Estacion invexistente");
                break;
        }
    }
}