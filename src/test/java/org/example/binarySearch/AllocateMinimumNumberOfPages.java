package org.example.binarySearch;

public class AllocateMinimumNumberOfPages {

    public static int findMinPages(int[] A, int B){

        int max = Integer.MIN_VALUE;
        int totalPages = 0;
        int minPages = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max) max = A[i];
            totalPages += A[i];
        }

        if(B ==1) return totalPages;
        else if(B == A.length) return max;

        int s = max, e = totalPages, result =Integer.MAX_VALUE;

        while (s<=e){
            int mid = s+((e-s)/2);
            int cur_pages = calculatePages(A,  mid);
            if( B >= cur_pages){
                minPages = Math.min(minPages, mid);
                        e = mid -1;
            } else s = mid+1;
        }
        return minPages;
    }

    public static int calculatePages(int[] p, int pages){
        int count =0;
        int number = 1;

        for (int i = 0; i < p.length; i++) {
            if(count+p[i]<=pages) count += p[i];
            else {
                count = p[i];
                number++;
            }
        }
        System.out.println(pages+" : "+number);

        return number;
    }

    public static void main(String[] args) {
        int[] pages = {97, 26, 12, 67, 10, 33, 79, 49, 79, 21, 67, 72, 93, 36, 85, 45, 28, 91, 94, 57, 1, 53, 8, 44, 68, 90, 24};
        int m = 26;

        System.out.println(findMinPages(pages, m));
    }
}
