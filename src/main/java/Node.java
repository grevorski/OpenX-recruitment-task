class Node
{
    private final int key;
    Node left, right;

    public Node(int value)
    {
        key = value;
        left = right = null;
    }

    public int getKey() {
        return key;
    }
}
