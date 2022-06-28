/**
 * 
 */
package com.daw.app.enumerados;

public enum EnumSexo {
	M("M") , F("F");
	
	private final String value;
	
	EnumSexo(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
