class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> list=new HashMap<>();

       for(String i:strs)
        {
            char c1[]=i.toCharArray();
            Arrays.sort(c1);
            String value=new String(c1);

            list.putIfAbsent(value, new ArrayList<>());
            list.get(value).add(i);
        }

        return new ArrayList<>(list.values());
    }
}
