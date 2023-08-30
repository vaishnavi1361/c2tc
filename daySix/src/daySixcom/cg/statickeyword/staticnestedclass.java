package daySixcom.cg.statickeyword;

public class staticnestedclass {
	static int data=25;
	static class Nest{
		void mms() {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		Nest n=new Nest();
		n.mms();
		// TODO Auto-generated method stub

	}

}
