public class MajorityElement {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    /*Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.*/
    public int majorityElement(final int[] A) {
        int elem=A[0];
        int count=1;
        for(int i=1;i<A.length;i++){
            if(A[i]==elem){
                count++;
            }else{
                count--;
            }
            if(count==0){
                elem=A[i];
                count=1;
            }
        }
        return elem;

    }
}
