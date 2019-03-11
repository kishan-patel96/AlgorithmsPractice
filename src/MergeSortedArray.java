//LC #88
public class MergeSortedArray
{
    //O(2(m + n))
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output = new int[m + n];
        for (int i = 0, j = 0; i < m || j < n; ) {
            if (i != m && j != n) {
                if (nums1[i] >= nums2[j]) {
                    output[i + j] = nums2[j++];
                } else {
                    output[i + j] = nums1[i++];
                }
            } else if (i == m && j != n) {
                output[i + j] = nums2[j++];
            } else {
                output[i + j] = nums1[i++];
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = output[i];
        }
    }

    //1 liner!
    public static void merge2(int[] A, int m, int[] B, int n)
    {
        while(n > 0) A[m + n - 1] = (m == 0 || B[n - 1] > A[m - 1]) ? B[--n] : A[--m];
    }
}
