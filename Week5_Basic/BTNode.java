package Week5_Basic;

public class BTNode {
    int data;
    BTNode left;
    BTNode right;

    public BTNode(int item){
        data = item;
        left = right = null;
    }
    
    public int getData(){ return data; }
}
