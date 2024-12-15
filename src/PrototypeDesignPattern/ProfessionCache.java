package PrototypeDesignPattern;

import java.util.Hashtable;

public class ProfessionCache {
	
	private static Hashtable<Integer, Profession> professionMap = new Hashtable<Integer,Profession>();
	
	public static Profession getCloneNewProfession(int id) {
		Profession cachedProfessionInstance = professionMap.get(id);
		return (Profession) cachedProfessionInstance.cloningMethod();
	}
	
	public static void loadProfessionCache() {
		Doctor doc = new Doctor();
		doc.setId(1);
		professionMap.put(doc.getId(), doc);
		
		Engineer eng = new Engineer();
		eng.setId(2);
		professionMap.put(eng.getId(), eng);
		
		
		Teacher teach = new Teacher();
		teach.setId(3);
		professionMap.put(teach.getId(), teach);
		
	}

}
