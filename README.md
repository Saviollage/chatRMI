# Chat Using RMI

Projeto desenvolvido para a disciplina de Sistemas paralelos e distribuídos.

Alunos:
Brenner Batista
Sávio Lage
Vitor Vidal

## Compilar projeto

Para compilar o projeto basta executar o comando
```bash
compileAll.bat
```

Ou executar os comandos separadamente:
```bash
javac -d build/classes -cp src/ src/client/ChatClient.java
javac -d build/classes -cp src/ src/server/ChatServer.java
```


## RMI Registry
Antes de executar o processo, é necessário definir as configurações de segurança. Para isso execute:

```bash
registro.bat
```

Ou executar os comandos separadamente
```bash
cd build\classes
rmic common.ChatImpl

rmiregistry 3000
```
```diff
- Importante - 
rmiregistry deve permanecer em execução o tempo todo
 ```

## Iniciar servidor

Para iniciar o servidor, basta executar

```bash
initServer.bat
```

Ou executar separadamente
```bash
cd build/classes
java server.ChatServer
```
```diff
- Importante - 
Servidor deve permanecer em execução o tempo todo
 ```
## Iniciar cliente

Para iniciar o client, basta executar

```bash
initClient.bat
```

Ou executar separadamente
```bash
cd build/classes
java client.ChatClient
```