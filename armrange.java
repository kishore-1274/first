public class armrange {
    public static void main (String args[]){
        int rem=0;
        for(int start=1;start<=350;start++)
        {
            int temp=start;
            int sum=0;
           int count=0;
            while(temp>0) {
                rem=temp%10;
                count++;
                temp = temp/10;
            }
            temp=start;
            while(temp>0){
                rem=temp%10;
                int power = (int) Math.pow(rem,count);
               sum=sum+power;
               temp=temp/10;
            }
            if(sum==start){
                System.out.println(start+"armstrong");
            }
            else{
                System.out.println("Not an armstrong");
            }

        }


    }
}
