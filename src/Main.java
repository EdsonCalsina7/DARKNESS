//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner edson = new Scanner(System.in);
    int numero1;
    int numero2;
    System.out.println("=====BIENVENIDO ASU EXAMEN DE HOY=====");
    System.out.println("====INGRESAR DOS NUMEROS ENTEROS");

    System.out.println("ingrese el primer numero entero");
    numero1 = edson.nextInt();

    System.out.println("ingrese el segundo numero entero");
    numero2 = edson.nextInt();


    if(numero1/numero2>0){
        System.out.println("el primer numero si es divisible por el segundo numero");
    }else {
        System.out.println("el primer numero no es divisible por el segundo");
    }
    if (numero2/numero1>=0){
        System.out.println("el segundo numero no es divisible por el primer numero");
    }else{
        System.out.println("si es divisible por el primer numero");

    }
    if (numero1>numero2){
        System.out.println("el primero es mayor");
    }else{
        System.out.println("no es mayo el primero");
    }
    if(numero1%2==0&&numero2%2==0){
        System.out.println("Ambos son pares");
    }else {
        System.out.println("ambos no son pares");
    }


}
