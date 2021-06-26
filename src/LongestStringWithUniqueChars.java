import java.util.HashSet;
import java.util.Set;

public class LongestStringWithUniqueChars {
    public static void main(String[] args) {
        String[] arr = new String[]{"uni", "q", "e", "tes", "xyz"};
        int result[] = new int[]{0};
        new LongestStringWithUniqueChars().longestString(arr, 0, "", result);
        System.out.println(result[0]);
    }

    private void longestString(String[] arr, int index, String path, int[] result) {
        boolean isUnique = checkUnique(path);
        if (isUnique) {
            result[0] = Math.max(result[0], path.length());
        }
        if (!isUnique || index == arr.length) {
            return;
        }

        for (int j = index; j <arr.length; j++) {
            longestString(arr, j+1, path+arr[j], result);
        }

    }

    private boolean checkUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (char a : s.toCharArray()) {
            if (set.contains(a)) {
                return false;
            }
            set.add(a);
        }
        return true;
    }
}
