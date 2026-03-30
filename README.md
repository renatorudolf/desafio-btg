#Débitos técnicos


1. linha 20 - A variável br(BufferedReader) esta sendo compartilhada entre várias threads e o arquivo esta sendo processados 10 vezes.
2. linha 32 - O executor está fechando antes das threads serem finalizadas.
3. linha 27 - Capturando exceção genérica, poderia capturar uma FileNotFoundException para caso o arquivo data.txt não ser encontrado. Mas sempre como boa prática uma exception na última claúsula.

> [!NOTE] Para esse código, o uso manual de thread com ExecutorService não é tão interessante, somente seria se, para cada linha tivesse que chamar uma API ou acessar banco de dados; 
> Nesse contexto, o ideal seria usar o parallel do Stream. O próprio java por debaixo dos panos usa ForkJoinPool e em tempo de execução é decidido a quantidade de threads a serem usadas, como fazer o balanceamento de carga e como será dividido o trabalho.


> [!TIP]
> Pasta src/..problem <- Arquivo com débitos técnicos
> Pasta src/..solution <- Arquivo corrigido

