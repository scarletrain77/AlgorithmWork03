/**
 * 
 */

/**
 * @author WangChen
 *
 */
public class Character {
	private char character;
	private String numberSerial;
	private int rate;
	Character(char c, String ns, int r){
		super();
		character = c;
		numberSerial = ns;
		rate = r;
	}
	Character(){
		super();
		character = 0;
		numberSerial = "";
		rate = 0;
	}
	
	public void setCharacter(char c){
		character = c;
	}
	
	public char getCharacter(){
		return character;
	}
	
	public void setNumberSerial(String ns){
		numberSerial = ns;
	}
	
	public String getNumberSerial(){
		return numberSerial;
	}
	
	public void setRate(int r){
		rate = r;
	}
	
	public int getRate(){
		return rate;
	}
	
	public String toString(){
		return "×Ö·û:" + character + "£¬±àÂë" + numberSerial + "£¬ÆµÂÊ" + rate;
	}
}
