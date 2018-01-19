package co.com.tns.conversor;

public class Conversor {

	public boolean hasHashTag(String cadena) {
		
		return ((cadena.charAt(0) == '#'));
	}

	public boolean determinarNumerosHashTag(String cadena) {
		
		return (contadorHashtag(cadena) < 7);
	}

	public boolean hasSpace(String cadena) {		
		
		return ' ' == cadena.charAt(contadorHashtag(cadena) );
	}
	
	public String formatear(String cadena) {
		
		if (!verificarFormato(cadena))
			
			return cadena;
		
		else {
			
			int numeroHashTag = contadorHashtag(cadena);
			
			String palabraSimple = cadena.substring(numeroHashTag + 1);
			
			StringBuilder sb = new StringBuilder();
			
			return sb.append("<H").append(numeroHashTag).append(">")
					.append(palabraSimple).append("</H").append(numeroHashTag)
					.append(">").toString();

		}	
	}
	
	
	private boolean verificarFormato(String cadena) {
		
		if (!hasHashTag(cadena))
			return false;
		
		if (!determinarNumerosHashTag(cadena))
			return false;
		
		if (!hasSpace(cadena))
			return false;
		
		return true;
	}
	
	
	private int contadorHashtag (String cadena) {
		
		int i =0;
		while(cadena.charAt(i) == '#') {
			i++;
		}
		
		return i;
	}

	

}
