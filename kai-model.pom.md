# jboss-fuse
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>com.kai.workshop</groupId>
    <artifactId>kai-workshop</artifactId>
    <version>0.0.1-SNAPSHOT</version>
  </parent>
  <artifactId>kai-model</artifactId>
  <name>kai-model</name>
  <packaging>bundle</packaging>
  
  <build>
    <plugins>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>${maven.compiler.plugin.version}</version>
        <configuration>
          <source>${maven.compiler.source}</source>
          <target>${maven.compiler.target}</target>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.felix</groupId>
        <artifactId>maven-bundle-plugin</artifactId>
        <version>${version.maven-bundle-plugin}</version>
        <extensions>true</extensions>
        <configuration>
          <instructions>
            <Export-Package>com.kai.workshop.model.*</Export-Package>
            <Import-Package>*</Import-Package>
          </instructions>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
