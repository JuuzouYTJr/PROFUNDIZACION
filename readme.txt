git push origin master      ->Subir
git pull origin master      ->Descargar ultimo commit
git branch Gonzalez         ->Crear Rama
git checkout Gonzalez       ->Entrar a directorio Gonzalez
git status                  ->Ver estado
git branch                  ->Ver ramas
git add -A                  ->Registrar cambios
git commit -m "         
git push -u origin Gonzalez ->Poner en directorio 
git log                     -> Ver log
git branch -a               ->Ver ramas locales y remotas
git checkout master         ->Entrar a rama master
git branch --merged         ->Vincular 2 ramas
git merge Gonzalez          ->
git push origin master      ->Enviar cambios a repositorio remoto
git push origin -d Gonzalez ->Borrar rama en remoto
git branch -d Gonzalez      ->Borrar directorio local

//Comentario
------
git checkout master            ->Entrar a directorio master
git pull origin master         ->Descargar ultimo commit que se hizo
git branch nombre_rama         ->Crear rama
git checkout nombre_rama       ->Entrar a directorio rama
//Hacer cambio a programa
git add -A                     ->Registrar cambios
git commit -m "Comentario"
git push origin nombre_rama           ->Subir al repositorio remoto
git branch --merged            ->Vincular master y rama
git merge nombre_rama       
git push origin master         ->Subir al remoto
------

git init -> Repositorio nuevo
git clone /path/to/repository  -> Crea una copia local del repositorio ejecutando
git clone username@host:/path/to/repository   ->  Si utilizas un servidor remoto, ejecuta
git add ->  Puedes registrar cambios (añadirlos al Index) usando
git commit -m "Commit message"   ->  Ahora el archivo esta incluído en el HEAD
git push origin master  -> Para enviar estos cambios a tu repositorio remoto
###Reemplaza master por la rama
git remote add origin <server>  ->  conectar tu repositorio local a un repositorio remoto
git checkout -b feature  -> Crear rama llamada feature
git checkout master  -> Volver a rama principal
git branch -d feature   -> Borrar rama
git push origin <branch  -> no estará disponible para los demás a menos que subas (push)
git pull -> Actualizar tu repositorio local al commit más nuevo


(Letra M) ->Se ha modificado
(letra U) ->Los ficeros son nuevos

