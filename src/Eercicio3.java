import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Eercicio3 {
    public static void main(String[] args){
        Scanner edson = new Scanner(System.in);
        int precio;
        double descuento;
        double total_pagar;
        double igv=0.18;
        double subtotal;
        System.out.println("===BIENVENIDO ASU COMPRA DE PRODUCTO:");
        System.out.println("ingrese el precio del producto:");
        precio = edson.nextInt();
        System.out.println("el producto a sido comprado:");

        if(precio>=150000){
            System.out.println("tiene descuento:");
        }
        else if(precio<150000){

            System.out.println("no tiene descuento:");
        }
        descuento=precio*0.25;
        subtotal=precio-descuento;
        total_pagar=subtotal+igv;
        System.out.println("precio del producto:"+precio);
        System.out.println("total a pagar:"+total_pagar);
        System.out.println("subtota a pagar:"+ subtotal);
        System.out.println("descuento:"+ descuento);
    }
}
