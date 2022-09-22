    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //Sort the array in asc order
        Arrays.sort(nums);
        
        //use 2 pointers - fp & lp
        for(int i=0;i+2<nums.length;i++){
            int fp = i+1;
            int lp = nums.length-1;
            
            // Skip all duplicates from left
            // num1Idx>0 ensures this check is made only from 2nd element onwards
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            while(fp < lp){
                
                int sum = nums[i] + nums[fp] + nums[lp];
                
                if(sum == 0){
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[fp]);
                    triplet.add(nums[lp]);
                    result.add(triplet);
                    
                    // Skip all duplicates from right
                    while(lp > fp && nums[lp-1] == nums[lp]){
                        lp--;
                    }
                
                    fp++;
                    lp--;
                }else if(sum > 0){

                    lp--;
                }else{

                    fp++;
                }
            }
        }
        
        return result;
    }
