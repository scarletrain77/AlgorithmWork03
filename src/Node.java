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
		rightChild = null;
		leftChild = null;
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
	
	public static String findCharacter(Node n, char character){
		//Node temp = new Node();
		//Node temp = n;
		if(n != null && n.value.getCharacter() == character){
			 //System.out.print("Rate: " + n.value.getRate() + ", ¹þ·òÂü: " + n.value.getNumberSerial() + ", ×ÖÄ¸£º " + n.value.getCharacter() + "\n");   
			System.out.println(n.value.getNumberSerial());
			//temp = n;
			return n.value.getNumberSerial();
		} else if (n!= null && n.value.getCharacter() != character){
			if(n.leftChild != null){
				System.out.println("left");
				return findCharacter(n.leftChild, character);  
			}
			if(n.rightChild != null){
				System.out.println("right");
				return findCharacter(n.rightChild, character);
			}
			//System.out.println("null");
			//return n
		}
		//return n.value.getNumberSerial();
		System.out.println("null");
		return null;
		//return null;
		
	}
}
