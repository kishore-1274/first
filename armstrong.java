import java.util.Scanner;
public class armstrong {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
    //int num=1634;
    int temp=num;
    int rem=0;
    int cou=0;
    int sum=0;
    while(num>0)//153>0 //15>0 //1>0
    {
        num=num/10;//15 //1 // //0
        cou++; //3
        //System.out.println(cou);
    }
    num=temp;
    while(num>0){//153>0 //15>0 //1>0
        rem= num%10; //3 //5 //1
        System.out.println(rem); //3
        int res=(int) Math.pow(rem,cou); //3,3=27// 5,3 =125 //1,3=1
        //System.out.println(res);
        sum=sum+res; //0+27=27 //27+125=152 //153
        num=num/10; //15 //1 //0
    }
        if(sum==temp){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }



    }
}
