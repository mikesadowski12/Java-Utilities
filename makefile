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

GuiClass: ./JavaSwingGUI/GuiClass.java MyButton
	$(compiler) $(flags) ./JavaSwingGUI/GuiClass.java 
	#mv ./JavaSwingGUI/GuiClass.class ./$(programname)
	#mv ./JavaSwingGUI/Button/MyButton.class ./$(programname)

MyButton:
	$(compiler) $(flags) ./JavaSwingGUI/MyButton.java
	
start:
	mkdir $(programname)
	
clean:
	rm -rf ./$(programname)
