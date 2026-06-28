public class minimumRecolorToGetKCOnsecutiveBlocks {}

    public int minimumRecolors(String blocks, int k) {

        int left = 0;
        int n = blocks.length();
        int white = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            if (blocks.charAt(right) == 'W') {
                white++;
            }
            if (right >= k - 1) {
                min = Math.min(white, min);
                if (blocks.charAt(left) == 'W') {
                    white--;
                }
                left++;
            }
        }
        return min;
    }
}