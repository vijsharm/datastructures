import java.util.ArrayList;
import java.util.List;

public class PerfectSumFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3,4,0,8,9,7, 6};
        int N = 7;
        new PerfectSumFromArray().perfectSum(arr, 0, new ArrayList<>(), N);
    }

    public void perfectSum(int[] arr, int i, List<Integer> path, int N) {
        int sum = 0;
        for (int k : path) {
           sum +=k;
        }
        if (sum == N) {
            System.out.println(path);
        }
        if (sum > N) {
            return;
        }
        if (i == arr.length) {
            return;
        }
        for (int j = i; j < arr.length; j++) {
            ArrayList<Integer> newPath = new ArrayList<>(path);
            newPath.add(arr[j]);
            perfectSum(arr, j+1, newPath, N);
        }
    }
}
