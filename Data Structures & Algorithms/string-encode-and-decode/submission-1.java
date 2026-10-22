class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            // Find the delimiter '#' starting from index i
            int delimiterPos = s.indexOf('#', i);
            
            // Extract length N
            int length = Integer.parseInt(s.substring(i, delimiterPos));
            
            // Move index to start of the actual string
            i = delimiterPos + 1;
            
            // Read length N characters
            result.add(s.substring(i, i + length));
            
            // Move index past the string for the next iteration
            i += length;
        }
        
        return result;
    
    }
}