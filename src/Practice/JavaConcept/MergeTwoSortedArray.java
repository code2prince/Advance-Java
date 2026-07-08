package Practice.JavaConcept;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,3,5,7,9,9};
        int[] res=new int[arr1.length+arr2.length];

        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                i++;
            }else{
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            res[k++]=arr1[i++];
        }

        while (j<arr2.length){
            res[k++]=arr2[j++];
        }

        for(int itr:res) {
                System.out.print(itr+ " ");  //1 1 2 3 3 4 5 5 7 9 9
        }

    }
}
