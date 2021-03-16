package InterviewCake.TreesNGraphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PerfectBalancedTree {

	private static class NodeDepthPair {

		BinaryTreeNode node;
		int depth;

		NodeDepthPair(BinaryTreeNode node, int depth) {
			this.node = node;
			this.depth = depth;
		}
	}

	public static boolean isBalanced(BinaryTreeNode treeRoot) {
		if(treeRoot == null) {
			return true;
		}
	
		List<Integer> depths = new ArrayList<>(3);
		Deque<NodeDepthPair> nodes = new ArrayDeque<>();
		nodes.push(new NodeDepthPair(treeRoot, 0));
		
		while(!nodes.isEmpty()) {
			NodeDepthPair pair  = nodes.pop();
			BinaryTreeNode node = pair.node;
			int depth = pair.depth;
			
			if(node.left == null && node.right == null) {
				if(!depths.contains(depth)) {
					depths.add(depth);
					if(depths.size()>2 || (depths.size()==2 && Math.abs(depths.get(0)-depths.get(1))>1)) {
						return false;
					}
				}
			} else {
				if(node.left!=null) {
					nodes.push(new NodeDepthPair(node.left, depth+1));
				}
				if(node.right !=null) {
					nodes.push(new NodeDepthPair(node.right, depth+1));
				}
			}
		}
		return true;
	}
}