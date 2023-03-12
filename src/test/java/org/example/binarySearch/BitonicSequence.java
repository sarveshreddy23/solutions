package org.example.binarySearch;

import org.junit.Test;

public class BitonicSequence {
        public int solve(int[] A, int B) {
            int s = 0, e = A.length;
            int p=0;
            while(s <= e){
                p = s + ((e-s)/2);
                if((A[p-1]<A[p]) && (A[p+1]<A[p]))
                    break;
                else if((A[p-1]<A[p])&& (A[p+1]>A[p])) s =p+1;
                else e= p-1;
            }
            System.out.println("pivot "+A[p]);
            s = 0;
            int end =p,  mid;

            while(s <= end){
                mid = s+((end-s)/2);
                if(A[mid]==B) return mid;
                else if(A[mid] > B) end = mid-1;
                else s = mid+1;
                System.out.println("start:"+A[s]+" end: "+A[end]+" mid: "+A[mid]);
            }

            s =p;
            end = A.length-1;

            while(s <= end){
                mid = s+((end-s)/2);
                if(A[mid]==B) return mid;
                else if(A[mid] > B) s = mid+1;
                else end = mid-1;
            }
            return -1;
        }

        @Test
        public void run(){
//            int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21 };
            int[] A = {1, 20, 50, 40, 10};
            System.out.println("index: "+solve(A, 5));
        }

    }
