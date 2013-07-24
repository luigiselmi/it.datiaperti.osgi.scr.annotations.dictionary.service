OSGi SCR Annotations Dictionary Service
=======================================

This is an example implemetation of a OSGi bundle that provides a service. To try it you have to clone the project, 
compile with

    mvn install

then install the bundle jar file into a OSGi container like Apache Felix. A client for this service is provided in the 
project [OSGi SCR Annotations Dictionary Client](https://github.com/luigiselmi/it.datiaperti.osgi.scr.annotations.dictionary.client). This 
service waits for a word sent by this client. The client acts as an interface between the user and the service. The user 
sends the guess word to the client writing on the Felix shell to which the client is listening and then the client pass 
the guess word to the service. If the word is one of those known by the service it will send back a response message "Correct" 
otherwise it sends "Incorrect". A blank line stops the client in passing words. To restore the client it must be deactiveted 
and then activeted again.

This service component uses Apache Service Component Runtime (SCR) Annotations to configure the wiring between it and other 
components (clients). The wiring between a service component and a client component is implemeted following the Dependency Injection 
pattern (constructor injection). The service name, interface and properties are declared as Java Annotations in the source code. The 
same service has been implemented using SCR Declarative Services in the [OSGi SCR Dictionary Service](https://github.com/luigiselmi/it.datiaperti.osgi.scr.xml.dictionary.service)
project.
