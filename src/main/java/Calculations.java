
public class Calculations {
    static Node ptrRoot;

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

    public void median(){

    }
}
