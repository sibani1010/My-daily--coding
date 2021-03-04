public class HelloWorld{

     public static void main(String []args){
        int a[]={1,2,3,4,5};
        int temp;
        int N=a.length;
        for(int i=0;i<N/2;i++)
        {
            temp=a[i];
            a[i]=a[N-i-1];
            a[N-i-1]=temp;
        }
        for(int i=0;i<N;i++)
        {
        System.out.println(a[i]);
        }
     }
}
