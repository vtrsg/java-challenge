<h1>Java Challenge</h1>

1.  Criar um método que retorna uma string. Este método vai receber uma string com datas em diferentes formatos e deve retornar a data no formato yyyy MM.

    Exemplo de datas enviadas:

```java

     "01/05/2018"
     "01 05 2018"
     "01052018"
     "2018 05 01"
```

2.  Criar um método que retorna uma string.
    Este método vai receber uma string array tamanhos diversos.

        Deve se usar um for para ler todos os campos do array e concatená los

        na string que será retornada pelo método.

```java
Exemplo: Vamos enviar {"CARLOS";"EDUARDO";"DA";"COSTA" ;"XAVIER"} e o método deve retornar "CARLOS EDUARDO DA COSTA XAVIER". 
```

3.  Criar um método que retorne um inteiro. Este método vai receber um int array ( tamanhos diversos). Deve se usar um for para ler todos os campos do array e encontrar o maior valor.

```java
Exemplo: Vamos enviar {334;568;123;796;225} e o método deve retornar 796.
```

4.  O que faz cada comando/função abaixo?

```java
1. int [] abas = {0,1,2};


2. if (documento.startsWith("0")) {

for (int xx=0;xx<10;xx++) {

       if (documento.length() > 1 && documento.startsWith("0"))

             documento = documento.substring(1);

      }

}

 

3. StringBuilder txtDados = new StringBuilder();

txtDados.append(“Este é um exemplo de dados para um arquivo”);

String filename = "C:/Arquivos/teste.txt";

writer = new FileWriter(filename);

writer.writeNewFile(txtDados.toString());

 

4. String dataMovimento = “07/05/2018”;

if(dataMovimento.length() > 9){

      int mesRef = Integer.parseInt(dataMovimento.substring(3,5)) - 1;

      int anoRef = Integer.parseInt(dataMovimento.substring(6,10));

     if (mesRef == 0) {

           mesRef = 12;

          anoRef = anoRef - 1;

           mesAnoX = StringUtil.leftPad(String.valueOf(mesRef),2,"0") + "/" +
String.valueOf(anoRef);

     }

}
```
