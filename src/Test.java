import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author WangChen
 *
 */
public class Test {
	public static void main(String[] args) {
		Character c1 = new Character('A',"",10);
		Character c2 = new Character('B',"",15);
		Character c3 = new Character('C',"",9);
		ArrayList<Node> chas = new ArrayList<Node>();
		chas.add(new Node(c1));
		chas.add(new Node(c2));
		chas.add(new Node(c3));
		for (int i = 0; i < chas.size(); i++){
			int number = Node.minNode(chas);
			Node temp = new Node();
			temp.leftChild = chas.get(number);
			chas.remove(chas.get(number));
			number = Node.minNode(chas);
			temp.rightChild = chas.get(number);
			chas.remove(chas.get(number));
			temp.setValue();			
			chas.add(temp);
		}
		Node.preOrder(chas.get(0));
		//System.out.println(chas.get(0).rightChild.leftChild.value.getRate());
	}
}
