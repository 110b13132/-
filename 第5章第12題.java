class CWin{
	int width;
	int height;
	String name;
	void  steW(int w) {
		width=w;
	}
	void  steh(int h) {
		height=h;
	}
	void setName(String s) {
		name=s;
	}
	public	void  show() {
		System.out.println("Name="+name);
		System.out.println("W="+width+", H="+height);
	}
	void setWindows(int w,int h,String s)
	 {
	 width=w;
	 height=h;
	 name=s;
	 }
}
public class t9 {

	public static void main(String[] args) {
		CWin cw=new CWin();
		cw.setName("1st Windows");
		cw.steW(5);
		cw.steh(3);
		cw.show();
		
		cw.setName("2st Windows");
		cw.setWindows(6,8,"2st Windows");
		cw.show();
		
		cw.setWindows(4,2,"3rd Windows");
		cw.show();
	}

}
