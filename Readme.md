<h1>Java Challenge</h1>

1.  Criar um método que retorna uma string. Este método vai receber uma string com datas em diferentes formatos e deve retornar a data no formato yyyy MM.

    Exemplo de datas enviadas:

    ```java

         "01/05/2018"
         "01 05 2018"
         "01052018"
         "2018 05 01"
    ```

        Resposta:

            java-challenge\src\DateFormatter.java

2.  Criar um método que retorna uma string.
    Este método vai receber uma string array tamanhos diversos.

        Deve se usar um for para ler todos os campos do array e concatená los

        na string que será retornada pelo método.

    ```java
    Exemplo: Vamos enviar {"CARLOS";"EDUARDO";"DA";"COSTA" ;"XAVIER"} e o método deve retornar "CARLOS EDUARDO DA COSTA XAVIER". 
    ```

        Resposta:

        java-challenge\src\ConcatenateString.java

3.  Criar um método que retorne um inteiro. Este método vai receber um int array ( tamanhos diversos). Deve se usar um for para ler todos os campos do array e encontrar o maior valor.

    ```java
    Exemplo: Vamos enviar {334;568;123;796;225} e o método deve retornar 796.
    ```

        Resposta:

            java-challenge\src\HigherValue.java

4.  O que faz cada comando/função abaixo?

    ```java
    1. int [] abas = {0,1,2};


    // cria um array de inteiros


    2. if (documento.startsWith("0")) {

    for (int xx=0;xx<10;xx++) {

           if (documento.length() > 1 && documento.startsWith("0"))

                 documento = documento.substring(1);

          }

    }

        // remove até 10 zeros a esquerda, caso documento iniciar com 0
     

    3. StringBuilder txtDados = new StringBuilder();

    txtDados.append(“Este é um exemplo de dados para um arquivo”);

    String filename = "C:/Arquivos/teste.txt";

    writer = new FileWriter(filename);

    writer.writeNewFile(txtDados.toString());

        /*
        Escreve a string txtDados em um arquivo chamado teste.txt na pasta Arquivos do Pc.
        */
     

    4. String dataMovimento = “07/05/2018”;

    if(dataMovimento.length() > 9){

          int mesRef = Integer.parseInt(dataMovimento.substring(3,5)) - 1;

          int anoRef = Integer.parseInt(dataMovimento.substring(6,10));

         if (mesRef == 0) {

               mesRef = 12;

              anoRef = anoRef - 1;

               mesAnoX = StringUtil.leftPad(String.valueOf(mesRef),2,"0") + "/" + String.valueOf(anoRef);

         }
    }

    /*
        Se o comprimento da string de data for maior que 9, ele extrai o mês e o ano, se o mês for igual a 0 ele ajusta para dezembro (pois está contando de zero a 11), com isso ele reduz o ano em -1. E caso o mês for um número menor que 10, adiciona um 0 a frente dele.
    */
    ```
