package besinciGunOdevi;

import besinciGunOdevi.utils.AuthUtil;
import besinciGunOdevi.utils.UserUtil;

public class Main {

	public static void main(String[] args) {

		System.out.println("+-+-+-+-+-+-+-+-+-+ Giri� i�lemleri +-+-+-+-+-+-+-+-+-+");
		
		AuthUtil.create();
		
		System.out.println();
		
		System.out.println("+-+-+-+-+-+-+-+-+-+ Kullan�c� i�lemleri +-+-+-+-+-+-+-+-+-+");
		
		UserUtil.create();
		
	}

}
