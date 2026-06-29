class Codec {
public:
    void solve(TreeNode* root, string &s) {
        if(root == NULL) {
            s += "N,";
            return;
        }
        s += to_string(root->val) + ",";
        solve(root->left, s);
        solve(root->right, s);
    }
    string serialize(TreeNode* root) {
        string s = "";
        solve(root, s);
        return s;
    }
    TreeNode* build(queue<string> &q) {
        string val = q.front();
        q.pop();

        if(val == "N")
            return NULL;

        TreeNode* root = new TreeNode(stoi(val));
        root->left = build(q);
        root->right = build(q);
        return root;
    }
    TreeNode* deserialize(string data) {
        queue<string> q;
        string temp = "";
        for(char ch : data) {
            if(ch == ',') {
                q.push(temp);
                temp = "";
            }
            else {
                temp += ch;
            }
        }
        return build(q);
    }
};
