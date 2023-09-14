import java.util.Scanner;
public class Main {

    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("A oldal: ");
        double weight = sc.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("B oldal: ");
        double weight2 = sc2.nextDouble();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("C oldal: ");
        double weight3 = sc3.nextDouble();
        double cub = weight*weight2*weight3;
        double cub2=2*(weight*weight2+weight2*weight3+weight3*weight);
        System.out.print("Kerülete:"+cub+" Felülete:"+cub2);

    }




}