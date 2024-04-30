import com.sun.source.tree.Tree;
import org.example.InvertBinaryTree;
import org.example.data_structure.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {
    private final InvertBinaryTree algo = new InvertBinaryTree();

    @Test
    void nullNode() {
        TreeNode node = null;
        Assertions.assertEquals(algo.invertTree(node), null);
    }

    @Test
    void oneNode() {
        TreeNode node = new TreeNode(0);
        TreeNode returnValue = algo.invertTree(node);
        Assertions.assertEquals(returnValue.getVal(), node.getVal());
        Assertions.assertEquals(returnValue.getRight(), null);
        Assertions.assertEquals(returnValue.getLeft(), null);
    }

    @Test
    void nonNullNode() {
        TreeNode node = new TreeNode(0);
        node.setRight(new TreeNode(2));
        node.setLeft(new TreeNode(4));
        TreeNode returnValue = algo.invertTree(node);

        Assertions.assertEquals(returnValue.getVal(), node.getVal());
        Assertions.assertEquals(returnValue.getRight().getVal(), new TreeNode(4).getVal());
        Assertions.assertEquals(returnValue.getLeft().getVal(), new TreeNode(2).getVal());
    }

    @Test
    void leftNull() {
        TreeNode node = new TreeNode(0);
        node.setRight(new TreeNode(2));
        node.setLeft(null);
        TreeNode returnValue = algo.invertTree(node);

        Assertions.assertEquals(returnValue.getVal() ,node.getVal());
        Assertions.assertEquals(returnValue.getRight() , null);
        Assertions.assertEquals(returnValue.getLeft().getVal() , new TreeNode(2).getVal());
    }

    @Test
    void rightNull() {
        TreeNode node = new TreeNode(0);
        node.setRight(null);
        node.setLeft(new TreeNode(2));
        TreeNode returnValue = algo.invertTree(node);

        Assertions.assertEquals(returnValue.getVal() ,node.getVal());
        Assertions.assertEquals(returnValue.getRight().getVal() , new TreeNode(2).getVal());
        Assertions.assertEquals(returnValue.getLeft() , null);
    }
}
