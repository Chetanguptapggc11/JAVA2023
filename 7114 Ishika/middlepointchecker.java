public class middlepointchecker{
public static void main(String[] args){
int num1=5;
int num2=8;
int num3=15;
	boolean result= ismiddlepoint(num1,num2,num3);
    System.out.println(result);
    }
    public static boolean ismiddlepoint(int a,int b,int c){
        // check if 'b' is the middle point between 'a' and 'c'
        return (a<b && b<c) || (c<b && b<a);
    }
}