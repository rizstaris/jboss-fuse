# jboss-fuse
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>com.kai.workshop</groupId>
    <artifactId>kai-workshop</artifactId>
    <version>0.0.1-SNAPSHOT</version>
  </parent>
  
  <artifactId>kai-ds</artifactId>
  <name>kai-ds</name>
  <packaging>bundle</packaging>
  
  <dependencies>
  	<dependency>
		<groupId>org.apache.commons</groupId>
		<artifactId>commons-dbcp2</artifactId>
		<version>${org.apache.commons.dbcp2.version}</version>
	</dependency>
	<dependency>
		<groupId>com.oracle</groupId>
		<artifactId>ojdbc6</artifactId>
		<version>${com.oracle.ojdbc6.version}</version>
	</dependency>
  </dependencies>
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
          <Import-Package>*</Import-Package>
          <Export-Package></Export-Package>
          </instructions>
        </configuration>
      </plugin>
    </plugins>
  </build>
  
</project>
