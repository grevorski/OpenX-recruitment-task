import java.util.ArrayList;
import java.util.List;

public class Calculations {
    static Node ptrRoot;
    List<Integer> list = new ArrayList<>();
    private int index = 0;
    public static void setPtrRoot(Node ptrRoot) {
        Calculations.ptrRoot = ptrRoot;
    }


    public double subtreeSum(Node start)
    {
        int l = 0, r = 0;
        if(start != null) {
            l += subtreeSum(start.left);
            r += subtreeSum(start.right);
            double sum = l + start.getKey() + r;
            if (ptrRoot != start) sum = l + start.getKey() + r;
            return  sum;
        }else return 0;
    }

    private int size(Node node)
    {
        if (null == node ) return 0;
        return 1 + size( node.left ) + size( node.right );
    }

    public double averageValue(Node node){
        return subtreeSum(node)/size(node);
    }

    private void treeToArray(Node root) {
        if(root == null){
            System.out.println("tree is empty");
        }
        else {
            if(root.left != null)
                treeToArray(root.left);
            list.add(index, root.getKey());
            index++;
            if(root.right != null)
                treeToArray(root.right);
        }
    }

    public double median(Node root){
        treeToArray(root); // always sorted cuz of BTS
        double middle;
        if (list.size()%2 == 0) {
            middle = (list.get(list.size()/2) + list.get(list.size()/2 - 1))/2.0;
        } else {
            middle = (list.get(list.size()/2));
        }
        return middle;
    }
}
