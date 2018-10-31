package hr.did.helpdesk.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hr.did.helpdesk.model.Hitnost;
import hr.did.helpdesk.model.Kategorija;
import hr.did.helpdesk.model.Zaposlenik;

public class MockHelper {
	
	public static List<Zaposlenik> mockZaposlenikList()
	{
		
		DateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
		Date rodjenje=new Date();
		try {
			rodjenje = sdf.parse("21.01.1972");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}				
		
		Date kreirano=new Date();
		try {
			kreirano = sdf.parse("15.05.2016");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}	
		
		Date promjena=new Date();;
		try {
			promjena = sdf.parse("15.05.2016");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}		
		
		Date rodjenje1=new Date();
		try {
			rodjenje = sdf.parse("21.07.1976");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}				
		
		Date kreirano1=new Date();
		try {
			kreirano = sdf.parse("10.08.2016");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}	
		
		Date promjena1=new Date();;
		try {
			promjena = sdf.parse("10.08.2016");			
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		
		Date rodjenje2=new Date();
		try {
			rodjenje = sdf.parse("01.04.1982");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}				
		
		Date kreirano2=new Date();
		try {
			kreirano = sdf.parse("12.03.2014");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}	
		
		Date promjena2=new Date();;
		try {
			promjena = sdf.parse("12.03.2014");			
		} catch (ParseException e) {			
			e.printStackTrace();
		}		
		
		List<Zaposlenik> zaposLista=new ArrayList<Zaposlenik>();
		zaposLista.add(new Zaposlenik(1,"Mirkić","Mirko","2","002233665","-Nema","Joća","Petrova","Zagreb","10000","2101972330114","12345678910",
				rodjenje,"M","Zagreb",1,"mmirkic","mojalozinka","02546315","nema","nema","nema","ddarkic",kreirano,"ddarkic",promjena,"SSS"));
		
		zaposLista.add(new Zaposlenik(2,"Jelkić","Jelka","2","002233654","-Nema","Pero","Martićeva","Zagreb","10000","2106978335887","12345478910",
				rodjenje1,"Ž","Zagreb",1,"jjelkic","mojalozinka","02546352","nema","nema","nema","ddarkic",kreirano1,"ddarkic",promjena1,"VŠS"));
		
		zaposLista.add(new Zaposlenik(3,"Darkić","Darko","1","002233666","-Nema","Marko","Ilica","Zagreb","10000","2107972330118","12345619780",
				rodjenje2,"M","Zagreb",1,"ddarkic","mojalozinka","02546366","nema","nema","nema","ddarkic",kreirano2,"ddarkic",promjena2,"VSS"));		
		
		return zaposLista;
	}
	
	public static List<Kategorija> mockKategorijaList()
	{
		List<Kategorija> kateLista=new ArrayList<Kategorija>();
				
		kateLista.add(new Kategorija (1,"Hardware",null));
		kateLista.add(new Kategorija (2,"Software",null));
		kateLista.add(new Kategorija (3,"Mreća",null));
		kateLista.add(new Kategorija (4,"IP telefonija",null));
		kateLista.add(new Kategorija (5,"Sistem",null));		
		kateLista.add(new Kategorija (5,"Ostalo",1));
		kateLista.add(new Kategorija (7,"Ostalo",2));
		kateLista.add(new Kategorija (8,"Ostalo",3));
		kateLista.add(new Kategorija (9,"Ostalo",4));
		kateLista.add(new Kategorija (10,"Ostalo",5));
		return kateLista;
	}
	
	public static List<Hitnost> mockHitnostList()
	{
		List<Hitnost> hitnostLista=new ArrayList<Hitnost>();
				
		hitnostLista.add(new Hitnost (1,"Vrlo velika"));
		hitnostLista.add(new Hitnost (2,"Velika"));
		hitnostLista.add(new Hitnost (3,"Srednja"));
		hitnostLista.add(new Hitnost (4,"Mala"));
		hitnostLista.add(new Hitnost (5,"Vrlo mala"));		
		
		return hitnostLista;
	}
}
