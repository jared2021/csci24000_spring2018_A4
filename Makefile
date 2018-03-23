#Honor Pledge:
#
#I pledge that I have neither given nor 
#received any help on this assignment.
#
#jascho
all: Driver.class Student.class Address.class

Driver.class: Driver.java
	javac Driver.java

Student.class: Student.java
	javac Student.java

Address.class: Address.java
	javac Address.java

run: 
	java Driver

clean:
	rm *.class
