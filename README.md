# spring-boot-cxf-jaxws-camel-proxy

An example project to create proxy service to real soap service using spring-boot-camel

## Run

- First start real server. go to cxf-jaxws-server directory and run below command

```
	mvn spring-boot:run
```

- Next start camel proxy server. go to camel-proxy-server directory and run below command

```
	mvn spring-boot:run
```
- Proxy webservice can be accessed from below url.

```
	http://localhost:8082/services/mathproxy
```

## Useful links

| Service                 	| Url                                      	|
|-------------------------	|------------------------------------------	|
| admin server jaxws      	| http://localhost:8080                    	|
| admin server proxy      	| http://localhost:8082                    	|
| cxf services list jaxws 	| http://localhost:8080/services           	|
| cxf services list proxy 	| http://localhost:8082/services           	|
| Soap Endpoint jaxws     	| http://localhost:8080/services/math      	|
| Soap Endpoint proxy     	| http://localhost:8082/services/mathproxy 	|