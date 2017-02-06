FROM jboss/base-maven

RUN mkdir -p /opt/jboss/cobis

WORKDIR /opt/jboss/cobis

COPY pom.xml /opt/jboss/cobis

RUN mvn clean install camel:run || true

COPY src /opt/jboss/cobis/src

RUN  mvn clean install

USER root

RUN chmod -R 777 /opt/jboss

USER jboss

EXPOSE 3333

CMD ["mvn", "camel:run"]
