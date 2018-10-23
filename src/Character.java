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
	
	public void addNumberSerial(String ns){
		numberSerial = addString(numberSerial, ns);
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
		return "字符:" + character + "，编码" + numberSerial + "，频率" + rate;
	}
	//字符串连接
    public static String addString(String text, String addstring) {
        StringBuilder sb = new StringBuilder(text);
        //应该在前面插入，不应该再后面接
        sb.insert(0, addstring);
        return sb.toString();
    }
}
