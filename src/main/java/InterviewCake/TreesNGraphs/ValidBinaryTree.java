package InterviewCake.TreesNGraphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBinaryTree {

	// Iterative soln
	private static class NodeBase {
		BinaryTreeNode node;
		int lowerBound;
		int upperBound;

		public NodeBase(BinaryTreeNode node, int lowerBound, int upperBound) {
			super();
			this.node = node;
			this.lowerBound = lowerBound;
			this.upperBound = upperBound;
		}
	}

	public static boolean isBinarySearchTree(BinaryTreeNode root) {
		Deque<NodeBase> stack = new ArrayDeque<>();
		stack.push(new NodeBase(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		while (!stack.isEmpty()) {
			NodeBase nb = stack.pop();
			BinaryTreeNode node = nb.node;
			int lowerBound = nb.lowerBound;
			int upperBound = nb.upperBound;

			if (node.value <= lowerBound || node.value >= upperBound) {
				return false;
			}
			if (node.left != null) {
				stack.push(new NodeBase(node.left, lowerBound, node.value));
			}
			if (node.right != null) {
				stack.push(new NodeBase(node.right, node.value, upperBound));
			}
		}
		return true;
	}
	
//   Recursive soln
	
//	public static boolean isBinarySearchTree(BinaryTreeNode node) {
//	return isBinarySearchTree(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
//	}

	private static boolean isBinarySearchTree(BinaryTreeNode node, int lowerBound, int upperBound) {
		if (node == null)
			return true;
		if (node.value <= lowerBound || node.value >= upperBound)
			return false;
		return isBinarySearchTree(node.left, lowerBound, node.value)
				&& isBinarySearchTree(node.right, node.value, upperBound);
	}
}
