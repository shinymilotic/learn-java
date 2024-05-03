import org.example.PathSum;
import org.example.data_structure.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {

    private final PathSum algo = new PathSum();

    @Test
    void hasPathSumLeft() {
        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(4));

        Assertions.assertTrue(algo.hasPathSum(root, 5));
    }

    @Test
    void hasPathSumRight() {
        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(4));


        Assertions.assertTrue(algo.hasPathSum(root, 7));
    }

    @Test
    void nullRoot() {
        TreeNode root = null;

        Assertions.assertFalse(algo.hasPathSum(root, 7));

    }

    @Test
    void oneRootMatchTarget() {
        TreeNode root = new TreeNode(3);

        Assertions.assertTrue(algo.hasPathSum(root, 3));
    }

    @Test
    void oneRootNonMatchTarget() {
        TreeNode root = new TreeNode(3);

        Assertions.assertFalse(algo.hasPathSum(root, 2));
    }

    @Test
    void noMatchTarget() {
        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(4));

        Assertions.assertFalse(algo.hasPathSum(root, 9));
    }
}
