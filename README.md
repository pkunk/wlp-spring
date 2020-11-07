Reproduce bug with Spring/OpenLiberty combination

To reproduce issue:

```
mvn package
mvn liberty:run
GET http://localhost:9080/wlp/list
```
