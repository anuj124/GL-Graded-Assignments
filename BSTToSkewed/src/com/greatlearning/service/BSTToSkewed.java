package com.greatlearning.service;

import com.greatlearning.model.Node;

public class BSTToSkewed {

	public Node node;
	
	static Node previousNode = null;
	public Node headNode = null;
	
	public void convertBSTToSkewed(Node root) {
		if(root == null)
        {
            return;
        }
		
		convertBSTToSkewed(root.left);
		
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            previousNode = root;
        }
        else
        {
            previousNode.right = root;
            root.left = null;
            previousNode = root;
        }
        
        
        convertBSTToSkewed(root.right);
	}
	
	public void traverseSkewed(Node root) {
		 if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.key + " ");
	        traverseSkewed(root.right);
	}
}
