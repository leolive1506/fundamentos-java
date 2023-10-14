public class FnString {
  public static void main() {
    String nome = " leonardo lopes santana ";
    // formatar
    System.out.println(nome.toUpperCase());
    System.out.println(nome.toLowerCase());
    System.out.println(nome.trim());
    nome = nome.trim();

    /**
     * recortar
     * substring
    */
    
    String[] nomesSeparados = nome.split(" ");
    int lengthPrimeiroNome = nomesSeparados[0].length();
    // +2 para tirar oo espaços
    String ultimoNome = nome.substring(
       lengthPrimeiroNome + nomesSeparados[1].length() + 2
    );
    System.out.println(ultimoNome);

    String nomeMeio = nome.substring(
      lengthPrimeiroNome + 1,
      lengthPrimeiroNome + nomesSeparados[1].length() + 1
    );
    System.out.println(nomeMeio);

    /**
     * substituid
     * replace
     */
    System.out.println(nome.replace("l", "q"));

    /**
     * buscar
     * indexOf, lastIndexOf
     */
    int primeiraOcorrencia = nome.indexOf("l");
    int ultimaOcorrencia = nome.lastIndexOf("l");
    System.out.printf("Primeira ocorrencia: %d e ultima ocorrencia: %d%n", primeiraOcorrencia, ultimaOcorrencia);

     

  }
}
