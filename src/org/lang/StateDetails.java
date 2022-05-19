package org.lang;

public class StateDetails extends LanguageInfo {
	public void southIndia() {
		System.out.println("Sount");
	}
	public void northIndia() {
		System.out.println("North");
	}
	
	public static void main(String[] args) {
		StateDetails r = new StateDetails();
		r.tamilLanguage();
		r.englishLanguage();
		r.hindiLanguage();
		r.southIndia();
		r.northIndia();
	}
	

}
