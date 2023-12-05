# grails-6-interceptor-check

## Request

```
curl localhost:8080/book
curl localhost:8080/monitoring

```

## STDOUT

```
| Running application...
2023-12-05 15:24:07.857  INFO --- [  restartedMain] g610.Application                         : The following 1 profile is active: "development"
2023-12-05 15:24:10.570  INFO --- [  restartedMain] g610.Application                         : Started Application in 3.155 seconds (JVM running for 3.693)
Grails application running at http://localhost:8080 in environment: development
2023-12-05 15:24:12.235 DEBUG --- [nio-8080-exec-1] g610.MainInterceptor                     : before -> org.apache.catalina.connector.RequestFacade@379daf8b, [controller:book], book, null
<===========--> 85% EXECUTING [43s]
> :bootRun
```