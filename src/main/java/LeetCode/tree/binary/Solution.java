package LeetCode.tree.binary;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		return bfs(list,0,root);
	}
	
	public List<List<Integer>> bfs(List<List<Integer>> list, int index, TreeNode node){
		if(node==null) return list;
		if(list.size()>index) {
			list.get(index).add(node.val);
		} else {
			List<Integer> intList = new ArrayList<>();
			intList.add(node.val);
			list.add(intList);
		}
		bfs(list,index+1,node.left);
		bfs(list,index+1,node.right);
		return list;
	}
	public static void main(String args[]) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(21);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(1);
		
		System.out.println(new Solution().levelOrder(root));
	}
}
