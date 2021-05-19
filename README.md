# springboot-jobrunnr-cron
`Creating Distributed Cron Jobs using Spring Boot`


### Requirements
 - JobRunr Dep
 - JSON parser Library [Jackson / GSON / Json-B]
 - ASM [ASM is an all purpose Java bytecode manipulation and analysis framework]
 
 
#### Important Note
```
All your servers must run the same version of your code. If your webapp server has a 
newer version with a method signature
that is not compatible with the server that processes your background jobs, 
a NoSuchMethod Exception will be thrown 
and job processing will fail!
```


### Work flow of JobRunnr:

- When enqueueing a background job, the lambda is decomposed and saved into the storage provider as Json.
- JobRunr returns immediately to the caller so that it is not blocking
- One or more background job servers poll the storage provider for new enqueued jobs and process them
- When finished, it updates the state in the storage provider and fetches the next job to perform
