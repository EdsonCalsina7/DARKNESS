import java.util.Scanner;
    static void main(String[] args){
        Scanner edson = new Scanner(System.in);
        int opcion;
            System.out.println("=====BIENEVENIDO A SU CALCULO DE POLIGONOS====");
            System.out.println(" 1_ CALCULAR AREA DEL TRIANGULO");

            System.out.println(" 2_ CALCULAR AREA DEL RECTAGULO");

        System.out.println("seleccione el pologono que desea calcular");
        opcion = edson.nextInt();
           switch(opcion){
               case 1:
                   calcularAreaTriangulo();
                   break;
               case 2:
                   calcularAreaRectangulo();
                   break;

               default:{
                   System.out.println("opcion no valida");
               }
           }
    }
static Scanner edson = new Scanner(System.in);
static int altura1;
static int base1;
static int altura2;
static int base2;
static int Area_del_triangulo;
static int Area_del_rectangulo;
static int opcion;
static void calcularAreaTriangulo(){
    System.out.println("calcular el area del triangulo");
    System.out.println("INGRESE LA BASE DEL TRIANGULO ");
    altura1= edson.nextInt();

    System.out.println("INGRESE LA ALTURA DEL TRIANGULO ");
    base1= edson.nextInt();
    Area_del_triangulo=base1*altura1/2;
    if(base1*altura1/2>0){
        System.out.println("el area del triangulo es:"+Area_del_triangulo);
    }
    System.out.println();
}
static void calcularAreaRectangulo(){
    System.out.println("calcular el area del triangulo");
    System.out.println("INGRESE LA BASE DEL RECTANGULO ");
    altura1= edson.nextInt();

    System.out.println("INGRESE LA ALTURA DEL RECTANGULO ");
    base1= edson.nextInt();
    Area_del_rectangulo= base2*altura2;
    if(base1*altura1>0){
        System.out.println("el area del resctangulo es:" + Area_del_rectangulo);

    }
}


