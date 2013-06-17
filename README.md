## USAGE

```
$ git clone <clone-url>
$ cd dw-backbone-project-template
$ mvn clean package
$ java -jar target/dw-backbone-project-template-0.0.1-SNAPSHOT.jar \
  server src/test/resources/config.yaml
```

Visit `http://localhost:8080`

Update `pom.xml` with your own _groupId_, _artifactName_ and _version_

## References

* [Dropwizard](http://dropwizard.codahale.com/)
* [Backbone.js](http://backbone.js)
