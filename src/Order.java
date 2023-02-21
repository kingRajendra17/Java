public class Order {
    public static void main(String[] arg){
        int myarray[] = {11,24,22,67,88,90,2};
        int temp=0;
        for(int i=0;i<myarray.length;i++){
           for(int j=i+1;j<myarray.length;j++){
            if(myarray[i]<myarray[j]){
                temp=myarray[i];
                myarray[i]=myarray[j];
                myarray[j]=temp;
            }
        }
        System.out.println(myarray[i]+" ");
    }
}
}