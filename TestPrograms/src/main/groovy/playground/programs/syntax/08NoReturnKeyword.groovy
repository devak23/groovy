package playground.programs.syntax
/*
  We can omit the return keyword at the end of the method. This is even true when the last statement is a conditional
  statement or a try-catch block.
*/

def simple() {
    "Hello World"
}

assert 'Hello World' == simple()

def isEntitled(b) {
    if (b) {
        "helpers.User is entitled"
    } else {
        "helpers.User is not entitled"
    }
}

assert 'helpers.User is entitled' == isEntitled(true)
assert 'helpers.User is not entitled' == isEntitled(false)


def readFile(file) {
    try {
        new File(file).text
    } catch(e) {
        "Received exception: ${e.message}"
    } finally {
        println 'Finally is executed but nothing returned'
        'Finally reached'
    }
}

assert 'Received exception: invalidFilename (No such file or directory)' == readFile('invalidFilename')

def newFile = new FileWriter('test').withWriter {it.write('file contents')}

assert 'file contents' == readFile('test')

new File('test').delete()


println "---- End of program ----"