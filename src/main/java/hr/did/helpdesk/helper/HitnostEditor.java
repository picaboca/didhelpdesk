package hr.did.helpdesk.helper;

import java.beans.PropertyEditorSupport;

import hr.did.helpdesk.model.Hitnost;

public class HitnostEditor extends PropertyEditorSupport{

	@Override
	public String getAsText() {
		Hitnost h=(Hitnost) this.getValue();
		return (h !=null ? h.getIdHitnost().toString() :"");
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Hitnost h=null;
		
		for (Hitnost hitnost: MockHelper.mockHitnostList()){
			if(hitnost.getIdHitnost().equals(Integer.parseInt(text))){
				h=hitnost;
				break;
			}
		}
		this.setValue(h);;
	}	
}
