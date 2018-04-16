package com.hzq.demo.demo;

/**
 * @author hezq
 * @Description: 二叉树
 * @date 2018/4/13 11:00
 */
public class TreeNode {

    //左节点
    private TreeNode leftTreeNode;

    //右节点
    private TreeNode rigthtTreeNode;

    //值
    private String value;

    public TreeNode(String value){
        this.value = value;
    }

    public TreeNode() {

    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRigthtTreeNode() {
        return rigthtTreeNode;
    }

    public void setRigthtTreeNode(TreeNode rigthtTreeNode) {
        this.rigthtTreeNode = rigthtTreeNode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}