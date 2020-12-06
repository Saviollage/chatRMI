@echo off
echo Favor permanecer na pasta raiz do projeto
pause
javac -d build/classes -cp src/ src/client/ChatClient.java
javac -d build/classes -cp src/ src/server/ChatServer.java
echo Compilado com sucesso!