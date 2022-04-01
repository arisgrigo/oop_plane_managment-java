JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
	main.java\
	PlaneComponent.java\
    PassengerCompartment.java\
	PrivateCompartment.java\
	EquipmentCompartment.java\
	CargoBay.java\
	Plane.java\

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class