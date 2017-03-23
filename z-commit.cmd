@echo off

SET DEBUG=True

echo.
echo ------- Iniciando Commit ---------------------
echo.

git add .
git commit -am "correção bugs"
git pull
git push
echo Press Enter...
pause


echo.