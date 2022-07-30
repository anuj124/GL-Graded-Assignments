package com.greatlearning.main;

import com.greatlearning.service.BSTToSkewed;
import com.greatlearning.model.Node;

public class Driver {
	public static void main(String[] args) {
		BSTToSkewed tree = new BSTToSkewed();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		tree.convertBSTToSkewed(tree.node);
		tree.traverseSkewed(tree.headNode);
	}
}
