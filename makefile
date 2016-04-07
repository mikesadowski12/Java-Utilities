#NAME: Mike Sadowski
#DATE:
#STUDENT ID: 0864810
#ASSIGNEMNT:

programname = program
output = Main.class
files = Main.java

compiler = javac
flags =

all: clean $(programname)
	
$(programname): start
	$(compiler) $(flags) $(files)
	mv *.class ./$(programname)

GUI:
	$(compiler) $(flags) ./JavaSwingGUI/GUI.java
	mv ./JavaSwingGUI/*.class .
	
start:
	mkdir $(programname)
	
clean:
	rm -rf ./$(programname)
