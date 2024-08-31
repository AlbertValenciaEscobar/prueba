import java.util.Scanner;

public class Supermercado{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
       String off="no";
       double contador=0;
       while(off=="no"){
        System.out.println("1. Escoger articulo del menu");
        System.out.println("2. Terminar las compras");
        int opcion1 = sc.nextInt();
        switch(opcion1){
            case 1:
                menu();
                int pedido = sc.nextInt();
                while( pedido>3){
                    System.out.println("porfavor escoja una opcion determinada");
                    pedido = sc.nextInt();
                }
                String lista = "";
                switch(pedido){
                    case 1:
                        lista = "Tomates";
                        break;
                    case 2:
                        lista = "Cebollas";
                        break;
                    case  3:
                        lista = "Zanahorias";
                        break;
                    }
                System.out.println("Cuantos vas a comprar?");
                int cantidad = sc.nextInt();
                System.out.println("Cual es el precio del producto?");
                double precio =sc.nextInt();
                double precio_total = total(cantidad,precio);
                contador += precio_total;
                System.out.println("comprastes "+cantidad + " " +lista+" con un precio unitario de "+precio+" pesos");
                System.out.println("El precio total del la compra es "+contador+ " pesos");
                System.out.println("¿Vas a comprar otro articulo o terminar la operacion?");
                break;
            case 2:
            System.out.println("Muchas gracias por su compra :)");
                off="si";
                break;
             
          }
       
       }
    }

    public static void menu(){
        Scanner sc = new Scanner (System.in);
        System.out.println("--Menu--");
        System.out.println("(1)Tomates - (2)Cebollas - (3)Zanahorias");
        System.out.println("¿Que vas a comprar?");

    }

    public static double total(int cant, double pre){
        double salida = cant*pre;
        return salida;
    }
}