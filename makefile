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
	
$(programname): start GuiClass
	$(compiler) $(flags) $(files)
	mv $(output) $(programname)

GuiClass: 
	$(compiler) $(flags) ./JavaSwingGUI/GuiClass.java ./JavaSwingGUI/Button/Button.java
	mv ./JavaSwingGUI/GuiClass.class ./$(programname)
	mv ./JavaSwingGUI/Button/Button.class ./$(programname)

start:
	mkdir $(programname)
	
clean:
	rm -rf ./$(programname)
