/**
 * To implement an interface we can use Groovy Map and with the as keyword, we can pass it to a method.
 */

def map = [
        // Implement a FileFilter.accept(File) method
        accept: {file -> file.path ==~ /.*\.(zip|pdf)$/}
] as FileFilter

new File('/home/abhay/Downloads').listFiles(map).each { println it.path}


/**
 * IF the interface we want to implement has more than one method, we can only use a map for implementation. However,
 * if the interface consists of just 1 method (as in the above case) we can implement it via closure as well.
 */

def docFilter = {it.path ==~ /.*\.doc$/}
new File("/home/abhay/Downloads").listFiles(docFilter as FileFilter).each {file -> println file.path}


println "---- End of program ----"
