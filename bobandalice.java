public class bobandalice {
    public static void main(String[] args) {
        int [] a={17,28,30};
        int [] b={99,16,0};
        int aliceResult=0;
        int bobResult=0;
        for(int i=0;i< a.length;i++){
            if (a[i]>b[i]){
                aliceResult+=1;
        }
            else if(a[i]< b[i]){
                bobResult+=1;
            }
            else {

            }

    }
        System.out.print(aliceResult +" ");
        System.out.println(bobResult);
    }
}
