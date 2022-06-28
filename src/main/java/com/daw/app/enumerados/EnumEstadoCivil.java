/**
 * 
 */
package com.daw.app.enumerados;

public enum EnumEstadoCivil {
	S("S"), C("C"), V("V"), D("D");
	
	private final String value;
	EnumEstadoCivil(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
