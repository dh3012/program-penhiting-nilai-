import java.util.Scanner;
    public class Main 
    {
      public static void main(String[] args)
      {
       Scanner input = new Scanner(System.in);
      System.out.print("masukan nilai 1 : ");
      int nilai1 = input.nextInt();
      System.out.print("masukan nilai 2 : ");
      int nilai2 = input.nextInt();
      System.out.print("masukan nilai 3 : ");
       int nilai3 = input.nextInt();
       int rataRata = (nilai1 + nilai2 + nilai3) / 3;
      
     
     if(rataRata >91 && rataRata < 100){
       System.out.println("Nilai mutu = a");
     } else if (rataRata >= 81 && rataRata <= 90) {
       System.out.println("Nilai mutu = b");
     } else if (rataRata >= 71 && rataRata <= 80){
       System.out.println("Nilai mutu = c");
     } else if (rataRata >= 61 && rataRata <= 70){
       System.out.println("Nilai mutu = d");
     } else if (rataRata >= 0 && rataRata <= 60){
       System.out.println("Nilai mutu = e");
     }
     
      
    }
  }
        
