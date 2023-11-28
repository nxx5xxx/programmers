package test2;

public class NerryTest2 {

	public static void main(String[] args) {
		System.out.println(execute("235030",700));
	}
	static String execute(String A,int B) {
		String str_sec = A.substring(4);
		String str_min = A.substring(2,4);
		String str_hour = A.substring(0,2);
		int tmp_sec = Integer.parseInt(str_sec);
		int tmp_min = Integer.parseInt(str_min);
		int tmp_hour = Integer.parseInt(str_hour);
		tmp_sec += B;
		if(tmp_sec>=60) {
			tmp_min+=tmp_sec/60;
			tmp_sec%=60;
			str_sec=tmp_sec+"";
		}
		for(int i=1;i<=2-str_sec.length();i++) {
			str_sec=0+str_sec;
		}
		if(tmp_min>=60) {
			tmp_hour+=tmp_min/60;
			tmp_min%=60;
			str_min=tmp_min+"";
			
		}
		for(int i=1;i<=2-str_min.length();i++) {
			str_min=0+str_min;
		}
		if(tmp_hour>=24) {
			tmp_hour%=24;
			str_hour=tmp_hour+"";
		}
		for(int i=1;i<=2-str_hour.length();i++) {
			str_hour=0+str_hour;
		}
		
		return str_hour+str_min+str_sec;
	}

}
