public class barchart {
    public static void main(String[] args) {
        int [] arr ={3,1,3,7,5};
        for(int i=0;i<arr.length;i++){
           for(int j=arr[i];j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\t");
            System.out.println();

        }

    }
}
