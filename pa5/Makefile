# Makefile
# Jongwoo Park
# jpark510
# pa5
# creates a jar file called Queens to run the program without java

Queens: Queens.class
	echo Main-class: Queens > Manifest
	jar cvfm Queens Manifest Queens.class
	rm Manifest
	chmod u+x Queens

Queens.class:
	javac -Xlint Queens.java

clean:
	rm -f Queens.class Queens
