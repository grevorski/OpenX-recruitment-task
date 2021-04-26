import java.util.Objects;

public class Calculations {
    private int count = 0;
    static Node ptr;

    public int subtreeSum(Node root)
    {
        int l = 0, r = 0;
        if(root != null) {
            l += subtreeSum(root.left);
            r += subtreeSum(root.right);
            count += l + r + root.getKey();
            if (ptr != root) count = l + root.getKey() + r;
            return count;
        }else return 0;
    }

    public double averageValue(Node root){

        return 0;
    }
}
