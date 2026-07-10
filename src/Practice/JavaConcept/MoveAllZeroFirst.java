package Practice.JavaConcept;

public class MoveAllZeroFirst {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,0,1,0};
        int zeroCount=0;
        for(int i:arr){
            if(i==0){
                zeroCount++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(i<zeroCount){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }

        for(int i:arr){
            System.out.print(i+ " ");  //0 0 0 0 0 1 1 1 1
        }


        //-----------Approach 2-----------------------
       // int[] arr1={1,0,0,1,0,1,0,1,0};

    }
}
