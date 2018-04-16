package com.hzq.demo.demo;

/**
 * @author hezq
 * @Description: 对二叉树进行CRUD操作
 * @date 2018/4/13 11:11
 */
public class TreeNodeCRUD {

    /**
     * 创建二叉树
     * @param value
     * @param leftTreeNode
     * @param rigthTreeNode
     * @return
     */
    public static TreeNode createTree(String value,TreeNode leftTreeNode,TreeNode rigthTreeNode){
        TreeNode treeNode1 = new TreeNode(value);
        treeNode1.setLeftTreeNode(leftTreeNode);
        treeNode1.setRigthtTreeNode(rigthTreeNode);
        return treeNode1;
    }

    /**
     * 中序遍历二叉树
     * @param treeNodeRoot 根节点
     */
    public static void listMidTree(TreeNode treeNodeRoot){
        if(treeNodeRoot != null){
            System.out.println(treeNodeRoot.getValue());
            listMidTree(treeNodeRoot.getLeftTreeNode());
            listMidTree(treeNodeRoot.getRigthtTreeNode());
        }
    }

    public static void listLeftTree(TreeNode treeNodeRoot){
        if(treeNodeRoot != null){
            listLeftTree(treeNodeRoot.getLeftTreeNode());
            System.out.println(treeNodeRoot.getValue());
            listLeftTree(treeNodeRoot.getRigthtTreeNode());
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = createTree("15",null,null);                 //   10
        TreeNode node2 = createTree("35",null,null);                 //  9  20
        TreeNode node3 = createTree("9",null,null);                  //    15 35
        TreeNode node4 = createTree("20",node1,node2);
        //根节点
        TreeNode node5 = createTree("10",node3,node4);
        listMidTree(node5);
        System.out.println("=============");
        listLeftTree(node5);
    }

}