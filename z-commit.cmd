@echo off

SET DEBUG=True

echo.
echo ------- Iniciando Commit ---------------------
echo.

git add .
git commit -m "Desenvolvimento"
git pull
git push
echo Press Enter...
pause


echo.