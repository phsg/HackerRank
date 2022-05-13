package com.renan;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	private String teste_1 = "{[()]}";
	private String teste_2 = "{[(])}";
	private String teste_3 = "{{[[(())]]}}";
	private String teste_4 = "{[()]()}";

	public static void main(String[] args) {

	}

	private static testarString(String pDados) {
		List<Character> vListCHaracter = new ArrayList<String>();

		for (int x=0; x<pDados.length();x++) {
			Character vCha = pDados.substring(x);
			if (vListCHaracter.isEmpty()) {
				vListCHaracter.add(vCha);
			} else {
				if (vCha.equals('{') or vCha.equals('[') or vCha.equals('{')) {
					vListCHaracter.add(vCha);	
				}else {
					if (vCha.equals('}'){
						if (!vCha.equals('{')) {
							System.out.println("NAO");					
						}
					} else if (!vCha.equals('{')) {
						System.out.println("NAO");					
					}
							or vCha.equals('[') or vCha.equals('{')) {	
					Character vTopo = vListCHaracter.get(vListCHaracter.size()-1);
				}
				
			}
		}
		System.out.println("SIM");
	}

}
