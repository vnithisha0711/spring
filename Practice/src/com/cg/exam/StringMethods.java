package com.cg.exam;

public class StringMethods {

//	public String getUnique(String str) {
//		String res="";
//		for(int i=0;i<str.length();i++) {
//			int flag=0;
//			for(int j=0;j<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j)&&i!=j) {
//					flag=1;
//					break;
//				}
//				else {
//					res=res+str.charAt(i);
//				}
//			}
//		}
//		
//		return res;
//	}
//	public String getDuplicate(String str) {
//		String res="";
//		for(int i=0;i<str.length();i++) {
//			int flag=0;
//			for(int j=i+1;j<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j)&&i!=j) {
//					if(flag==0) {
//						res=res+str.charAt(i);
//						flag=1;
//					}
//					else {
//						for(int k=0;k<res.length();k++) {
//							if(!(str.charAt(j)==res.charAt(k))) {
//								res=res+str.charAt(i);
//							}
//						}
//					}
//				}
//				}
//				}
//		return res;
//	}
//	public static class Source{
//		public static void main(String args[] ) throws Exception {
//			
//			StringMethods a = new StringMethods();
//			String str1 = a.getUnique("Doselect is a Great platform");
//			System.out.println(str1);
//		}
//	}
	
	
	String s = "";
	int count = 0;
	String S = "";
	String Str = "";

	public String getUnique(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				s = s + str.charAt(i);
			}
			count = 0;
		}
		return s;
	}

	public String getDuplicate(String str) {
		StringMethods a = new StringMethods();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (i < j) {
						count++;
					}
				}
			}
			if (count == 1) {
				S = S + str.charAt(i);
			}
			count = 0;
		}

		return S;
	}

	public static class Source {

		public static void main(String[] args) {
			StringMethods a = new StringMethods();
			String str1 = a.getUnique("Doselect is a Great platform");
			System.out.println(str1);
			
			String str2=a.getDuplicate("Doselect is a Great platform");
			System.out.println(str2);
		}
		
	}
}
