package fibonaci;
import java.util.Scanner;
public class FIBONACI {
    public static void main(String[] args) {
        // TODO code application logic here
        int salir;
        int a=0;
        int b=1;
        int c=1;
        Scanner sc=new Scanner(System.in);
        salir=sc.nextInt();
        while(salir!=0 && salir<=45){      
            for(int i=0;i<salir;i++){
                if(i==salir-1){
                    System.out.println(c);
                }
                else{
                System.out.print(c+" ");
                }
                c=a+b;
                a=b;
                b=c;
            }
            a=0;
            b=1;
            c=1;
            
            salir=sc.nextInt();                             
        }
    }  
}