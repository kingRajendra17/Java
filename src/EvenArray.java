public class EvenArray {
    public static void main(String[] arg){
        int a[] = {11,24,22,67,88,90,2};
        System.out.println("even numbers");

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}


