package session1;
/**
 * 
 * @author 91997 
 * POJO PLAIN OLD JAVA OBJECT , ENTITY ALSO CALLED DTO (DATA TRANSFER OBJECT)
 */
public class Animal {
	private int id;
	private String color;
	private String sound;
	
	/**
	 * @param id
	 * @param color
	 * @param sound
	 */
	public Animal(int id, String color, String sound) {
		super();
		this.id = id;
		this.color = color;
		this.sound = sound;
	}
	public int getId()
   {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	

}
