# Makefile
# Jongwoo Park
# jpark510
# pa4
# creates a jar file called Roots to run the program without java

Roots: Roots.class
	echo Main-class: Roots > Manifest
	jar cvfm Roots Manifest Roots.class
	rm Manifest
	chmod u+x Roots
	java Roots

Roots.class: Roots.java
	javac -Xlint Roots.java

clean: 
	rm -f Roots.class Roots


