@echo off

SET DEBUG=True

echo.
echo ------- Iniciando Commit ---------------------
echo.

git add .
git commit -am "corre��o bugs"
git pull
git push
echo Press Enter...
pause


echo.