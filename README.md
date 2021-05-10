# manager-cta-api
API do Sistema de Gestão do Centro Tático Aéreo do Maranhão


## Requisitos
* Java 11
* Mysql 5.7.*
* Maven 3.6

## Preparando Ambiente
* ```mvn clear install```
* Crie o banco com o nome ```db_manager_cta```
* Observe o usuário e senha no arquivo ```application.yml```

## Instruções Iniciais do Login
* Importe a collection no postman: ```https://www.getpostman.com/collections/27291a349641b436a19f```
* Na pasta Auth possui a rota ```/authencation```, faça o login com o usuário ```manager``` e senha ```123```
* Será retornado o token (por enquanto será fixo) que será utilizado nas outras rotas
* Para requisitar outras rotas, como ```/hello``` adicione o token no header 
