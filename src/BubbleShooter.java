public class BubbleShooter {
    public static void main(String[] args) {

    }

    public int bubbleShooter(char arr[][]) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int burst = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int newBurst = floodFill(arr, visited, i, arr.length, 'y');
        }

        return 0;
    }

    private int floodFill(char[][] arr, boolean[][] visited, int start, int n, char color) {
        //while (arr[n][start] == )
        return 0;
    }
}
