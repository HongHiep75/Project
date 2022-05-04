package context;

import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import dao.ListProductDAO;
import model.Product;

public class test {
	public static void main(String[] args) throws Exception {
		String a = "3555559";
		int b = 3;
          char[] cc = a.toCharArray();
		System.out.println(lineEncoding("aabbbc"));
		System.out.println(a+=10);

	}

	public static String lineEncoding(String s) {
		String a = "";
		int soLap = 1;
		int n = s.length();
		for(int i = 0; i < n; i++) {
			
			for(int j = i+1; j < n; j++) {
				if(s.charAt(i) == s.charAt(j)) {
					soLap++;
				}else {
					break;
				}
			}
			
			if(soLap != 1) {
				a += soLap + s.charAt(i);
				 i += soLap;
				soLap = 1;
			}else {
				a += s.charAt(i);
			}
		}
		
		return a;
	}
}
