package week5;

public class TV {
	String com;
	int when;
	int size;
	TV(String name,int when,int size){
		com = name;
		this.when = when;
		this.size = size;
	}
	
	void show() {
		System.out.println(com+"에서 만든 "+when+"년형 "+size+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2020,32);
		myTV.show();
	}
} 

