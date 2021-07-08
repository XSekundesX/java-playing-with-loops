import java.util.Scanner;

public class Loops {
    //Aplicação utilizará laços para localizar divisores entre dois números "a" e "b" dados pelo usuário
    public static void main(String[] args) {

        int a, b;//Serão os números dados pelo usuário
        boolean divisivel = false;//Divisível é uma flag que será utilizada na formatação do texto
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        a=scan.nextInt();//Inicializando o primeiro número

        System.out.print("Insira o segundo número: ");
        b=scan.nextInt();//Inicializando o segundo número

        //Caso algum numero inserido seja negativo, será convertido para positivo
        if(a<0)
            a=a*(-1);
        if(b<0)
            b=b*(-1);

        //Identificando divisores de a
        for(int i=1; i<=a; i++){
            if(a%i==0){
                if(!divisivel) {
                    divisivel = true;
                    System.out.print(a + " é divisível por: " + i);
                }
                else
                    System.out.print(" "+i);
            }
        }
        System.out.println("");
        divisivel=false;

        //Identificando divisores de b
        for(int i=1; i<=b; i++){
            if(b%i==0){
                if(!divisivel) {
                    divisivel = true;
                    System.out.print(b + " é divisível por: " + i);
                }
                else
                    System.out.print(" "+i);
            }
        }
        System.out.println("");
        divisivel=false;

        //Identificando divisores comuns entre a e b,  no caso de a<b
        if(a<=b){
            int i=1;
            while(i<a){
                if(a%i==0 && b%i==0){
                    if(!divisivel) {
                        System.out.print(a + " e " + b + " são divisíveis por: "+i);
                        divisivel=true;
                    }
                    else
                        System.out.print(" "+i);
                }
                i++;
            }
            
        } else{//Identificando divisores comuns entre a e b,  no caso de b<a
            int i=1;
            while(i<=b){
                if(a%i==0 && b%i==0){
                    if(!divisivel) {
                        System.out.print(a + " e " + b + " são divisíveis por: "+i);
                        divisivel=true;
                    }
                    else
                        System.out.print(" "+i);
                }
                i++;
            }
        }
    }
}
