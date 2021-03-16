package InterviewCake.TreesNGraphs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static InterviewCake.TreesNGraphs.PerfectBalancedTree.isBalanced;

class PerfectBalancedTreeTest {

	@Test
	public void fullTreeTest() {
		final BinaryTreeNode root = new BinaryTreeNode(5);
		final BinaryTreeNode a = root.insertLeft(8);
		final BinaryTreeNode b = root.insertRight(6);
		a.insertLeft(1);
		a.insertRight(2);
		b.insertLeft(3);
		b.insertRight(4);
		final boolean result = isBalanced(root);
		assertTrue(result);
	}

	@Test
	public void bothLeavesAtTheSameDepthTest() {
		final BinaryTreeNode root = new BinaryTreeNode(3);
		root.insertLeft(4).insertLeft(1);
		root.insertRight(2).insertRight(9);
		final boolean result = isBalanced(root);
		assertTrue(result);
	}

	@Test
	public void leafHeightsDifferByOneTest() {
		final BinaryTreeNode root = new BinaryTreeNode(6);
		root.insertLeft(1);
		root.insertRight(0).insertRight(7);
		final boolean result = isBalanced(root);
		assertTrue(result);
	}

	@Test
	public void leafHeightsDifferByTwoTest() {
		final BinaryTreeNode root = new BinaryTreeNode(6);
		root.insertLeft(1);
		root.insertRight(0).insertRight(7).insertRight(8);
		final boolean result = isBalanced(root);
		assertFalse(result);
	}

	@Test
	public void bothSubTreesSuperbalancedTest() {
		final BinaryTreeNode root = new BinaryTreeNode(1);
		root.insertLeft(5);
		final BinaryTreeNode b = root.insertRight(9);
		b.insertLeft(8).insertLeft(7);
		b.insertRight(5);
		final boolean result = isBalanced(root);
		assertFalse(result);
	}

	@Test
	public void bothSubTreesSuperbalancedTwoTest() {
		final BinaryTreeNode root = new BinaryTreeNode(1);
		final BinaryTreeNode a = root.insertLeft(2);
		a.insertLeft(3);
		a.insertRight(7).insertRight(8);
		root.insertRight(4).insertRight(5).insertRight(6).insertRight(9);
		final boolean result = isBalanced(root);
		assertFalse(result);
	}

	@Test
	public void threeLeavesAtDifferentLevelsTest() {
		final BinaryTreeNode root = new BinaryTreeNode(1);
		final BinaryTreeNode a = root.insertLeft(2);
		final BinaryTreeNode b = a.insertLeft(3);
		a.insertRight(4);
		b.insertLeft(5);
		b.insertRight(6);
		root.insertRight(7).insertRight(8).insertRight(9).insertRight(10);
		final boolean result = isBalanced(root);
		assertFalse(result);
	}

	@Test
	public void onlyOneNodeTest() {
		final BinaryTreeNode root = new BinaryTreeNode(1);
		final boolean result = isBalanced(root);
		assertTrue(result);
	}

	@Test
	public void treeIsLinkedListTest() {
		final BinaryTreeNode root = new BinaryTreeNode(1);
		root.insertRight(2).insertRight(3).insertRight(4);
		final boolean result = isBalanced(root);
		assertTrue(result);
	}

}
