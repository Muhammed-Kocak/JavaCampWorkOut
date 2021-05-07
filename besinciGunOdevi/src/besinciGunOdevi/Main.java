package besinciGunOdevi;

import besinciGunOdevi.utils.AuthUtil;
import besinciGunOdevi.utils.UserUtil;

public class Main {

	public static void main(String[] args) {

		System.out.println("+-+-+-+-+-+-+-+-+-+ Giriþ iþlemleri +-+-+-+-+-+-+-+-+-+");
		
		AuthUtil.create();
		
		System.out.println();
		
		System.out.println("+-+-+-+-+-+-+-+-+-+ Kullanýcý iþlemleri +-+-+-+-+-+-+-+-+-+");
		
		UserUtil.create();
		
	}

}
