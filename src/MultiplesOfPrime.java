import java.util.Arrays;

public class MultiplesOfPrime {
    /*GIven three prime numbers A, B and C and an integer D.

You need to find the first(smallest) D integers which only have A, B, C or a combination of them as their prime factors.*/
    public int[] solve(int A, int B, int C, int D) {
        if (D == 0) {
            return new int[]{};
        }
        int[] res = new int[D+1];
        res[0] = 1;
        int i = 0;
        int x=0, y=0, z=0;
        while (i < D) {
            int min = Math.min(A*res[x], Math.min(B*res[y], C*res[z]));
            if (min == A*res[x]) x++;
            if (min == B*res[y]) y++;
            if (min == C*res[z]) z++;
            i++;
            res[i] = min;
        }
        return Arrays.copyOfRange(res, 1, D+1);
    }
}
