package fibonacci.findbiggestnumber;

public class FindBiggestNumber {
    public int findBigNumberInArray(int[]arr) {
        if(arr.length<0){
            return Integer.MIN_VALUE;
        } else if(arr.length >0) {
            int bigNumber = arr[0];
            for (int i = 0; i <arr.length;i++){
                if(arr[i] > bigNumber){
                    bigNumber = arr[i];
                }
            }
            return bigNumber;
        }
        return Integer.MIN_VALUE;
    }
}
