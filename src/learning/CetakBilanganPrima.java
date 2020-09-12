package learning;
import java.util.Scanner;

public class CetakBilanganPrima {
	public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, start, end;
        
         System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
         System.out.print("Mulai dari : ");
         start=input.nextInt();
         System.out.print("Sampai : ");
         end=input.nextInt();
         System.out.println("----------------------------------------------");
         System.out.println("Bilangan prima dari "+start+" sampai " +end+" adalah:");
        for (int i=start; i<=end; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}
