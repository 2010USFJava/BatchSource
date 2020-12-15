# Spring ORM

The Spring Framework supports integration with the Java Persistence API (JPA) and supports native Hibernate for resource management, data access object (DAO) implementations, and transaction strategies. For example, for Hibernate, there is first-class support with several convenient IoC features that address many typical Hibernate integration issues. You can configure all of the supported features for OR (object relational) mapping tools through Dependency Injection. They can participate in Spring’s resource and transaction management, and they comply with Spring’s generic transaction and DAO exception hierarchies. The recommended integration style is to code DAOs against plain Hibernate or JPA APIs.

## Configuring Spring and Hibernate through the `web.xml`

	<!-- DataSource bean using Apache Commons DBCP2 connection pooler -->
	<bean id="myDataSource" class="org.apache.commons.dbcp2.BasicDataSource">
		<property name="driverClassName" value="oracle.jdbc.driver.OracleDriver"/>
		<property name="url" value="jdbc:oracle:thin:@localhost:1521:ORCL"/>
		<property name="username" value="admin"/>
		<property name="password" value="p4ssw0rd"/>
	</bean>
	
	<!-- SessionFactory bean -->
	<bean id="mySessionFactory" class="org.springframework.orm.hibernate5.LocalSessionFactoryBean">
		<property name="dataSource" ref="myDataSource"/>
		<property name="packagesToScan" value="com.revature"/>
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">org.hibernate.dialect.Oracle10gDialect</prop>
				<prop key="hibernate.show_sql">true</prop>
				<prop key="hibernate.format_sql">true</prop>
				<prop key="hibernate.hbm2ddl.auto">create</prop>
			</props>
		</property>
	</bean>
	
	<!-- TransactionManager bean -->
	<bean id="transactionManager" class="org.springframework.orm.hibernate5.HibernateTransactionManager">
		<property name="sessionFactory" ref="mySessionFactory"/>
	</bean>

## Spring Transaction Management

Comprehensive transaction support is among the most compelling reasons to use the Spring Framework. The Spring Framework provides a consistent abstraction for transaction management that delivers the following benefits:

- A consistent programming model across different transaction APIs, such as Java Transaction API (JTA), JDBC, Hibernate, and the Java Persistence API (JPA).

- Support for declarative transaction management.

- A simpler API for programmatic transaction management than complex transaction APIs, such as JTA.

- Excellent integration with Spring’s data access abstractions.

## Transaction Propagation Levels

- `MANDATORY`
  - Support a current transaction, throw an exception if none exists.

- `NESTED`
  - Execute within a nested transaction if a current transaction exists, otherwise behave like REQUIRED.

- `NEVER`
  - Execute non-transactionally, throw an exception if a transaction exists.

- `NOT_SUPPORTED`
  - Execute non-transactionally, suspend the current transaction if one exists.

- `REQUIRED`
  - Support a current transaction, create a new one if none exists.

- `REQUIRES_NEW`
  - Create a new transaction, and suspend the current transaction if one exists.

- `SUPPORTS`
  - Support a current transaction, execute non-transactionally if none exists.

## Transaction Isolation Levels

- `READ_UNCOMMITTED`
  - Default transaction isolation level
  - Susceptible to all concurrency-related transactional issues

- `READ_COMMITTED`
  - Protects against the 'dirty read' concurrency issue

- `REPEATABLE_READ`
  - Protects against the 'dirty read' and the 'repeatable read' concurrency issues

- `SERIALIZABLE`
  - Protects against the 'dirty read', 'repeatable read', and 'phantom read' concurrency issues