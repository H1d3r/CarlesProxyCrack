#!/bin/sh
cp charles.jar.bak charles.jar
javac -classpath ".:javassist.jar" Main.java
java -classpath ".:javassist.jar" Main
jar uvf charles.jar com/xk72/charles/kKPk.class
