class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max_count=Integer.MIN_VALUE;
        int max_ele=-1;
        for(int key:map.keySet()){
            if(max_count<=map.get(key)){
                max_count=map.get(key);
                max_ele=key;
            }
        }
        return max_ele;
    }
}