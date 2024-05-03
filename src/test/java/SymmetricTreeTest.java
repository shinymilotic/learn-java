import org.example.SymmetricTree;
import org.example.data_structure.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    private final SymmetricTree algo = new SymmetricTree();

    @Test
    void nullNode() {
        TreeNode node = null;
        boolean returnValue = algo.isSymmetric(node);

        Assertions.assertEquals(returnValue, false);
    }

    @Test
    void oneRoot() {
        TreeNode node = new TreeNode(0);
        node.setRight(new TreeNode(2));
        node.setLeft(null);
        boolean returnValue = algo.isSymmetric(node);

        Assertions.assertEquals(returnValue, true);
    }

    @Test
    void symmetricSimple() {
        TreeNode node = new TreeNode(0);
        node.setRight(new TreeNode(2));
        node.setLeft(new TreeNode(2));
        boolean returnValue = algo.isSymmetric(node);

        Assertions.assertEquals(returnValue, true);
    }

    @Test
    void notSymmetricSimple() {
        TreeNode node = new TreeNode(0);
        node.setRight(new TreeNode(2));
        node.setLeft(new TreeNode(3));
        boolean returnValue = algo.isSymmetric(node);

        Assertions.assertEquals(returnValue, false);
    }

    @Test
    void notSymmetricNull() {
        TreeNode node = new TreeNode(0);
        node.setRight(new TreeNode(2));
        node.setLeft(null);
        boolean returnValue = algo.isSymmetric(node);

        Assertions.assertEquals(returnValue, false);
    }
}
