public class BreakingRecords {
    public static void main(String[] args) {
        int [] score ={10,5,20,20,4,5,2,25,1};
        int max = score[0];
        int min = score[0];

        int countmax=0;
        int countMin=0;
        for(int i=1;i<score.length;i++)
        {
            if(score[i]>max)
            {
                countmax+=1;
                max=score[i];
            }
            else if(score[i]<min)
            {
                countMin+=1;
                min=score[i];
            }
//            else if(score[i]==min && score[i]==max)
//            {
//                countmax+=1;
//                countMin+=1;
//            }
        }
        System.out.println(countmax+" "+countMin);
    }
}
