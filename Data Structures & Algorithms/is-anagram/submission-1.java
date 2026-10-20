class Solution {
    public boolean isAnagram(String s, String t) {
       int [] arr = new int[26];
       char[] sArr = s.toCharArray();
       char[] tArr = t.toCharArray();

        for(char c:sArr){
            int index = c -'a';
            arr[index] = arr[index]+ 1;
            
        }
        for(char c:tArr){
            int index = c -'a';
            arr[index] = arr[index]-1;
        }

        for(int i:arr){
            if(i>0 || i<0){
                return false;
            }
        }
        return true;

    }
}
