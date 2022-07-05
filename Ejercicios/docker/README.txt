#crear una imagen
docker build -t spring_app .

#crear una red y visualizarla
docker network create myNetwork
docker network ls

#ejecutar postgres en la misma red 
docker run -h postgres --network myNetwork --name postgres_test -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=contrasena -e POSTGRES_DB=test -d postgres 

#ejecutar y conectar a una red
docker run -dit --name spring_test --network myNetwork -v ~/nginxlogs:/var/log/nginx -p 8081:8081 spring_app

#visualizar los contenedores de la red
docker network inspect myNetwork

#acceder a postgres
docker exec -it postgres_test psql -U postgres -W test

#crear tabla en postgres
CREATE TABLE employee
(
 employeeName varchar(100) NOT NULL,
  employeeId varchar(11) NOT NULL ,
 employeeAddress varchar(100) DEFAULT NULL,
 employeeEmail varchar(100) DEFAULT NULL,
 PRIMARY KEY (employeeId)
);

