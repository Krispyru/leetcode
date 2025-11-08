
class Solution {
    public static int reverseBits(int n) {

        int result = 0;
        for (int i = 0; i < 32; i++) {
            // 0001 -> 0010
            result <<= 1;
            // n = 1011
            // 1011 & 0001 -> 0001
            // 0010 | 0001 -> 0011
            result |=  n & 1;
            // 1011 -> 0101
            n >>>= 1;
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(reverseBits(1));
    }
}