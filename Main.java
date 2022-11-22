import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=0;
            Cajero cajero=new Cajero();
            cajero.ingresarT();
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Escoja la accion a realizar con su tarjeta: \n 1 Depositar Dinero \n 2 Retirar Dinero \n 3 Imprimir estado \n 4 Salir");
        opcion=sc.nextInt();

        switch (opcion)
        {
            case 1:
                cajero.deposito();
                break;
            case 2:
                cajero.retiro();
                break;
            case 3:
                cajero.imprimirEstado();
                break;
            default:
                break;


        }}while(opcion<4);



    }
}
