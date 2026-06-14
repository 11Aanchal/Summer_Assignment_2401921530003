class Solution {
public:
    int compress(vector<char>& chars) {
        int n = chars.size();
        int write = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && chars[j] == chars[i]) {
                j++;
            }
            chars[write++] = chars[i];
            int count = j - i;
            if (count > 1) {
                string s = to_string(count);
                for (char c : s) {
                    chars[write++] = c;
                }
            }
            i = j; 
        }
        return write;
    }
};
