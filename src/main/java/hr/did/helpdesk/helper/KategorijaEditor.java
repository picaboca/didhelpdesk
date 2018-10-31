package hr.did.helpdesk.helper;

import java.beans.PropertyEditorSupport;

import hr.did.helpdesk.model.Kategorija;

public class KategorijaEditor extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		Kategorija k=(Kategorija) this.getValue();
		return (k !=null ? k.getIdKategorija().toString() :"");
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Kategorija k=null;
		
		for (Kategorija kategorija: MockHelper.mockKategorijaList()){
			if(kategorija.getIdKategorija().equals(Integer.parseInt(text))){
				k=kategorija;
				break;
			}
		}
		this.setValue(k);;
	}
	
}
