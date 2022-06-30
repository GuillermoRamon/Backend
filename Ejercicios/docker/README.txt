#crear una imagen
docker build -t spring_app .

#crear una red y visualizarla
docker network create myNetwork
docker network ls

#ejecutar y conectar a una red
docker run -dit --name spring_test --network myNetwork spring_app -v ~/nginxlogs:/var/log/nginx -p 8081:8081


#ejecutar postgres en la misma red 
docker run --network myNetwork --name postgres_test -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=contrasena -e POSTGRES_DB=test

#visualizar los contenedores de la red
docker network inspect myNetwork

