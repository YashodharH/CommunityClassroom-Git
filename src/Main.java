public class Main {
    public static void main(String[] args)
    {
        int a[] ={1,2,3,4,5,12,9,5,7};
        for (int i = 0; i <a.length ; i++) {
            int count=0;
            for (int j = 2; j <i ; j++) {
                if (a[i]%j==0){
                    count++;
                }
            }
            if (count==0 && a[i]!=0) System.out.println(a[i] + " ");

        }
    }
}