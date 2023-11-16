import java.util.Scanner;
public class typeconversion{
public static void main(String[]args){
    int decnum,remain,quot,i=1,j=1;
    int octnum[]=new int [100];
    Scanner scan=new Scanner(System.in);
    System.out.println("INPUT A DECIMAL NUMBER:");
    decnum=scan.nextInt();
    quot=decnum;
    while(quot!=0){
        octnum[i++]=quot % 8;
        quot=quot/8;
        System.out.print(octnum[j]);
    }
    System.out.print("\n");
    }
}
