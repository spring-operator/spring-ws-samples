# Spring Web Services Samples

[Spring Web Services] is a product of the Spring community focused on creating
document-driven, contract-first Web services. This repository contains sample
projects illustrating usage of Spring Web Services.

## Sample Applications

The following sample applications demonstrate the capabilities of [Spring Web
Services]. See the README within each sample project for more information and
additional instructions.

- [airline](./airline) - a complete airline sample that shows both Web Service and 
	O/X Mapping functionality in a complete application
- [echo](./echo) - a simple sample that shows a bare-bones Echo service
- [mtom](./mtom) - shows how to use MTOM and JAXB2 marshalling
- [stockquote](./stockquote) - shows how to use WS-Addressing and the Java 6 HTTP Server
- [tutorial](./tutorial) - contains the code from the Spring-WS tutorial
- [weather](./weather) - shows how to connect to a public SOAP service

## Running the Server

Most of the sample apps can be built and run using the following commands from
within the ``server`` folder.

	```sh
	$ ./gradlew tomcatRun
	```

Or alternatively, run the following to create war archive which can be deployed
in any Web Container.

	```sh
	$ ./gradlew war
	```

## Running the Client(s)

Most of the sample apps have a separate ``client`` directory containing clients
that connect to the server. You can run these clients by using the following
command from within each of client subdirectories:

	```sh
	$ gradle runClient
	```

## License

[Spring Web Services] is released under version 2.0 of the [Apache License].

[Spring Web Services]: https://projects.spring.io/spring-ws
[Apache License]: https://www.apache.org/licenses/LICENSE-2.0
