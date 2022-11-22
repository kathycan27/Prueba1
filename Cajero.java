import java.util.Scanner;

public class Cajero {
    int numeroT;
    String nombreT;
    String apellidoT;
    int claveT;
    double dinero=20;
    double deposito=0;
    double total=0;
    double retiro=0;
    /*public Cajero(int numeroT, String nombreT, String apellidoT, int claveT, double dinero) {
        this.numeroT = numeroT;
        this.nombreT = nombreT;
        this.apellidoT = apellidoT;
        this.claveT = claveT;
        this.dinero = dinero;
    }*/

    Cajero datosT[]=new Cajero[5];

    Scanner sc=new Scanner(System.in);
    public void ingresarT()
    {
        System.out.println("---------- Bienvenidos a CAjeros Michi----------");



            for(int i=0; i<1;i++)
            { datosT[i]=new Cajero();
                System.out.println("Ingrese su numero de tarjeta: ");
                numeroT= sc.nextInt();
                datosT[i].setNumeroT(numeroT);
                System.out.println("Ingrese su nombre: ");
                nombreT= sc.next();
                datosT[i].setNombreT(nombreT);
                System.out.println("Ingrese su apellido: ");
                apellidoT= sc.next();
                datosT[i].setApellidoT(apellidoT);
                System.out.println("Ingrese su clave: ");
                claveT= sc.nextInt();
                datosT[i].setClaveT(claveT);


            }

    }
    public void deposito()
    {for(Cajero cajero:datosT)
    {

    }


        System.out.println("Ingrese la cantidad que desea depositar: ");
        deposito= sc.nextDouble();
        total=getDinero()+deposito;
        setDinero(total);
        System.out.println(dinero);



    }
    public void retiro()
    {for(Cajero cajero:datosT)
    {

    }


        System.out.println("Ingrese la cantidad que desea depositar: ");
        retiro= sc.nextDouble();
        if(retiro<getDinero()&&getDinero()!=0) {
            total = getDinero() + retiro;
            System.out.println(total);
        }else System.out.println("La cantidad que desea retirar es mayor a la disposible: Cantidad disponible: "+getDinero());



    }
    public void imprimirEstado()
    {
        for(Cajero cajero:datosT)
        {}
        System.out.println(datosT.toString());
    }

    public int getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(int numeroT) {
        this.numeroT = numeroT;
    }

    public int getClaveT() {
        return claveT;
    }

    public void setClaveT(int claveT) {
        this.claveT = claveT;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public void setApellidoT(String apellidoT) {
        this.apellidoT = apellidoT;
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "numeroT=" + numeroT +
                ", nombreT='" + nombreT + '\'' +
                ", apellidoT='" + apellidoT + '\'' +
                ", dinero=" + dinero +
                '}';
    }
}
