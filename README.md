* @Author zenghao
# sping-cloud-zuul
zuul重试同一实例不同服务机制

pom.xml

		<spring-cloud.version>Camden.SR6</spring-cloud.version>  !-- 版本必须大于等于Camden.SR6（否则重试只能在this.server重试）  -->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            
            
1、访问路径： http://localhost:7999/hello?token=1212&name=12123
