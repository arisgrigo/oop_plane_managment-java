JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
	Employee.java\
	SecurityEmployee.java\
	MaintenanceEmployee.java\
	CleaningEmployee.java\

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class