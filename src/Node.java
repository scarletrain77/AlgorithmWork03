import java.util.ArrayList;

/**
 * 
 */

/**
 * @author WangChen
 *
 */
public class Node {
	public Node leftChild;
	public Node rightChild;
	public Character value;
	Node(){
		value = new Character();
	}
	Node(Character v){
		value = v;
	}
	public static int minNode(ArrayList<Node> al){
		Node min = al.get(0);
		int number = 0;
		for (int i = 0; i< al.size(); i++){
			if(min.value.getRate() > al.get(i).value.getRate()){
				min = al.get(i);
				number = i;
				//System.out.println(al.get(i).value.getRate());
			}
		}
		return number;
	}
	
	public void setValue(){
		if(leftChild != null && rightChild != null){
			int number = (leftChild.value.getRate() + rightChild.value.getRate());
			//System.out.println(number);
			this.value.setRate(number);
		}
	}
	
	public static void preOrder(Node n){
		if(n != null){
			 System.out.print("Rate: " + n.value.getRate() + ", ¹þ·òÂü: " + n.value.getNumberSerial() + ", ×ÖÄ¸£º " + n.value.getCharacter() + "\n");   
	         preOrder(n.leftChild);  
	         preOrder(n.rightChild); 
		}
	}
}
