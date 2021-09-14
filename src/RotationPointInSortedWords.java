public class RotationPointInSortedWords {
    public static void main(String[] args) {
        String[] words = new String[]{
        "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote",
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage"};
        System.out.println(rotationCheck(words));

    }
    private static int rotationCheck(String[] arr) {

        int l = 0, h = arr.length - 1;
        int mid = (l+h)/2;
        while (l <= h) {
            if (arr[mid].compareTo(arr[h]) < 0) {
                h = mid -1;
            } else if (arr[mid].compareTo(arr[l]) > 0) {
                l = mid + 1;
            }
            break;
        }
        return mid;
    }
}
