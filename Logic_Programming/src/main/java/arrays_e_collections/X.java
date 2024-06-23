package arrays_e_collections;

public class X {

        public static void main(String[] args) {

            int[] nums = new int[]{2, 7, 11, 15};
            int target = 9;

                int[] v = new int[2];
                int n;
                for (int i = 0; i < nums.length; i++) {
                    for (int j = i + 1; j < nums.length; j++) {
                        n = nums[i] + nums[j];
                        if (n == target) {
                            v[0] = i ;
                            v[1] = j;
                        }
                    }

                }

            for (int j : v) {
                System.out.println(j);
            }



        }

    }

