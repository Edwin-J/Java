
public class TelevisionTest{

	public static void main(String[] args) {
		Television tv = new Television();
		
		tv.setChannel(7);
		tv.volume = 0;
		tv.onOff = true;
		
		tv.print();

		System.out.println("채널 : " + tv.getChannel());
		tv.setChannel(88);
		System.out.println("채널 : " + tv.getChannel());
		
	}
}
