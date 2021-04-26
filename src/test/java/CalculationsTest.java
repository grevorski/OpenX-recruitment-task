import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {

    @Test
    public void calculations_subtreeSum_fromRoot(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root);

        Assert.assertEquals(result,38);
    }

    @Test
    public void calculations_subtreeSum_leftRootChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.left);

        Assert.assertEquals(result,10);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildLeftLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.left.left);

        Assert.assertEquals(result,2);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildRightLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.left.right);

        Assert.assertEquals(result,5);
    }

    @Test
    public void calculations_subtreeSum_rightRootChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.right);

        Assert.assertEquals(result,23);
    }

    @Test
    public void calculations_subtreeSum_rightRootChildLeftLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.right.left);

        Assert.assertEquals(result,1);
    }


    @Test
    public void calculations_subtreeSum_rightRootChildRightChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.right.right);

        Assert.assertEquals(result,15);
    }

    @Test
    public void calculations_subtreeSum_rightRootChildRightChildRightChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.right.right.right);

        Assert.assertEquals(result,13);
    }
    @Test
    public void calculations_subtreeSum_rightRootChildRightChildLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.right.right.right.right);

        Assert.assertEquals(result,5);
    }
    @Test
    public void calculations_subtreeSum_nullNode(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();

        int result = sum.subtreeSum(testTree.root.right.right.right.right.right);

        Assert.assertEquals(result,0);
    }
}
