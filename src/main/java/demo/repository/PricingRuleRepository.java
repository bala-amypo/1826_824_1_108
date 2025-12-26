package com.example.demo.repository;

import com.example.demo.model.PricingRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PricingRuleRepository extends JpaRepository<PricingRule, Long> {

    // Check if a PricingRule exists with the given ruleCode
    boolean existsByRuleCode(String ruleCode);

    // Find a PricingRule by ruleCode
    Optional<PricingRule> findByRuleCode(String ruleCode);

    // Find all PricingRules where active = true
    List<PricingRule> findByActiveTrue();
}
coder@12141a91f3ee:~/Workspace$ cd demo
coder@12141a91f3ee:~/Workspace/demo$ mvn spring-boot:run
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:3.3.4:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ demo ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ demo ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 42 source files with javac [debug parameters release 17] to target/classes
[WARNING] /home/coder/Workspace/demo/src/main/java/demo/config/SecurityConfig.java:[28,13] csrf() in org.springframework.security.config.annotation.web.builders.HttpSecurity has been deprecated and marked for removal
[WARNING] /home/coder/Workspace/demo/src/main/java/demo/config/SecurityConfig.java:[29,13] authorizeHttpRequests() in org.springframework.security.config.annotation.web.builders.HttpSecurity has been deprecated and marked for removal
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ demo ---
[INFO] skip non existing resourceDirectory /home/coder/Workspace/demo/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ demo ---
[INFO] No sources to compile
[INFO] 
[INFO] <<< spring-boot-maven-plugin:3.3.4:run (default-cli) < test-compile @ demo <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:3.3.4:run (default-cli) @ demo ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.4)

2025-12-26T08:02:45.452Z  INFO 103924 --- [demo] [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 17.0.17 with PID 103924 (/home/coder/Workspace/demo/target/classes started by coder in /home/coder/Workspace/demo)
2025-12-26T08:02:45.461Z  INFO 103924 --- [demo] [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2025-12-26T08:02:51.290Z  INFO 103924 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-12-26T08:02:51.878Z  INFO 103924 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 517 ms. Found 6 JPA repository interfaces.
2025-12-26T08:02:55.703Z  INFO 103924 --- [demo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 9001 (http)
2025-12-26T08:02:55.792Z  INFO 103924 --- [demo] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-12-26T08:02:55.793Z  INFO 103924 --- [demo] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.30]
2025-12-26T08:02:56.551Z  INFO 103924 --- [demo] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-12-26T08:02:56.554Z  INFO 103924 --- [demo] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 10655 ms
2025-12-26T08:02:57.470Z  INFO 103924 --- [demo] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-12-26T08:02:57.685Z  INFO 103924 --- [demo] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.5.3.Final
2025-12-26T08:02:57.790Z  INFO 103924 --- [demo] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2025-12-26T08:02:59.000Z  INFO 103924 --- [demo] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-12-26T08:02:59.099Z  INFO 103924 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-12-26T08:02:59.992Z  INFO 103924 --- [demo] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@3bf5911d
2025-12-26T08:02:59.996Z  INFO 103924 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-12-26T08:03:00.103Z  WARN 103924 --- [demo] [           main] org.hibernate.orm.deprecation            : HHH90000025: MySQL8Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2025-12-26T08:03:00.105Z  WARN 103924 --- [demo] [           main] org.hibernate.orm.deprecation            : HHH90000026: MySQL8Dialect has been deprecated; use org.hibernate.dialect.MySQLDialect instead
2025-12-26T08:03:05.460Z  INFO 103924 --- [demo] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2025-12-26T08:03:05.889Z  INFO 103924 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-12-26T08:03:09.174Z  WARN 103924 --- [demo] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-12-26T08:03:09.363Z  INFO 103924 --- [demo] [           main] r$InitializeUserDetailsManagerConfigurer : Global AuthenticationManager configured with UserDetailsService bean with name customUserDetailsService
2025-12-26T08:03:12.878Z  INFO 103924 --- [demo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 9001 (http) with context path '/'
2025-12-26T08:03:12.975Z  INFO 103924 --- [demo] [           main] com.example.demo.DemoApplication         : Started DemoApplication in 33.016 seconds (process running for 37.303)
2025-12-26T08:07:49.751Z  INFO 103924 --- [demo] [nio-9001-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2025-12-26T08:07:49.752Z  INFO 103924 --- [demo] [nio-9001-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2025-12-26T08:07:49.757Z  INFO 103924 --- [demo] [nio-9001-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 5 ms
