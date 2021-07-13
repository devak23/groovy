# Do this for IntelliJ 2021.1.3

To run Groovy from within IntelliJ do this:

### VM options:
--add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED


### Add the JaxB dependencies
1. open Module Settings
2. Add Jars or directories
3. Locate $GROOVY_HOME/lib/extras-jaxb and add to the path


courtesy: https://www.logicbig.com/tutorials/misc/groovy/intellij.html