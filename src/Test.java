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
			//String tempSerialNumber = "";
			temp.leftChild.value.addNumberSerial("0");
			chas.remove(chas.get(number));
			number = Node.minNode(chas);
			temp.rightChild = chas.get(number);
			temp.rightChild.value.addNumberSerial("1");
			chas.remove(chas.get(number));
			temp.setValue();			
			chas.add(temp);
		}
		chas.get(0).value.setNumberSerial("0");
		//
		//Node.preOrder(chas.get(0));
		//Node a = 		
		//Node.findCharacter(chas.get(0), 'B');
		System.out.println(chas.get(0).rightChild.leftChild.value.getNumberSerial());
		//System.out.println(Node.findCharacter(chas.get(0), 'A'));
		//System.out.println(chas.get(0).rightChild.leftChild.value.getRate());
		//System.out.println(addString("aaaa", "aass"));
	}

}
