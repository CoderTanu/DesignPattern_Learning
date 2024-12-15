package PrototypeDesignPattern;

public class PrototypePatterMainClass {

	public static void main(String[] args) {
		ProfessionCache.loadProfessionCache();
		
		Profession docPro = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docPro);
		
		Profession engPro = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engPro);
		
		Profession teacherPro = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacherPro);
		
		
		Profession docPro2 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docPro2);
	}

}
