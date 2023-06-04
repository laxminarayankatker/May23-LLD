package LoopableNode;

public class Node2 {
    public Node2(int data)
    {
      this.data = data;
    }
    int data;
    Node2 nextNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node2 getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node2 nextNode) {
        this.nextNode = nextNode;
    }
}
