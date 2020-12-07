@echo off
echo Certifique-se que compilou o projeto no comando compile.bat
pause
cd build\classes
rmic common.ChatImpl
pause
@echo on
rmiregistry 3000