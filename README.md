# Spring Boot Recipe Application - Unit Testing Example

All source code examples in the repository are for my [Online Course - Testing Spring Beginner to Guru](https://www.udemy.com/testing-spring-boot-beginner-to-guru/?couponCode=GITHUB_REPO)

This source code repository contains JUnit 4 and JUnit 5 test examples with Maven.

## Setup

### Requirements
* Should use Java 11 or higher. Previous versions of Java are un-tested.
* Use Maven 3.5.2 or higher

## Support
For questions and help:
* Please post in course
* Or post in the Slack Community exclusive to the course.

GitHub Issues will not be addressed.

# JUnit Annotations
| JUnit 4 | JUnit 5 |
|---|---|
| @Before | @BeforeEach |
| @After | @AfterEach |
| @BeforeClass | @BeforeAll |
| @AfterClass | @AfterAll |
| @Ignore | @Disabled |
| @Category | @Tag |
| @RunWith(SpringJunitClassRunner.class) | @ExtendWith(SpringExtension.class) |
| @Test(expected=Foo.class) | Assertions.assertThrows(FooException.class) |

# update dependencies
* JUnit5 property
```
		<junit-platform.version>5.7.0</junit-platform.version>
```
* JUnit5 dependencies
``` 
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>${junit-platform.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>${junit-platform.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.platform</groupId>
			<artifactId>junit-platform-commons</artifactId>
			<version>1.7.0</version>
			<scope>test</scope>
		</dependency>
```
* junit vintage
```
		<dependency>
			<groupId>org.junit.vintage</groupId>
			<artifactId>junit-vintage-engine</artifactId>
			<version>${junit-platform.version}</version>
			<scope>test</scope>
		</dependency>
```

* surefire & failsafe dependency & plugin
```
		<!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin -->
		<dependency>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-surefire-plugin</artifactId>
			<version>2.22.2</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-failsafe-plugin -->
		<dependency>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-failsafe-plugin</artifactId>
			<version>2.22.2</version>
			<scope>test</scope>
		</dependency>


	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-failsafe-plugin</artifactId>
			</plugin>

```

