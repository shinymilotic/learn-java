import org.example.SumRootLeafNumbers;
import org.example.data_structure.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumRootLeafNumbersTest {

    private final SumRootLeafNumbers algo = new SumRootLeafNumbers();

    @Test
    void normal() {
        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(4));


        Assertions.assertEquals(algo.sumNumbers(root), 32 + 34);
    }


}
