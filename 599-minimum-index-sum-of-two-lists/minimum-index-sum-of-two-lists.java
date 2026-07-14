class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        
        int min = Integer.MAX_VALUE;
        List<String> ans = new ArrayList<>();
        for (String letter:list1) {
            if (map2.containsKey(letter)) {
                int sum = map1.get(letter)+map2.get(letter);
                if (sum<min) {
                    min=sum;
                    ans.clear();
                    ans.add(letter);
                } else if (sum==min) {
                    ans.add(letter);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
}