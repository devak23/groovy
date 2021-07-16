package playground.programs.syntax

/**
 * Groovy follows Java's exception handling with a twist. In Groovy, every exception is optional including the checked
 * exceptions. So we don't need to define it as a part of our method signature. In Groovy we can choose at which level
 * should the exception be handled. The compiler wont stop us from handling exception also means we need to have a good
 * discipline to do it ourselves.
 */

try {
    def url = new URL('malformed')
} catch (MalformedURLException e) {
    assert true
    assert e in MalformedURLException
}

// Method throws a MalformedURLException but we dont have to define it.
def createURL() {
    new URL('Malformed Again!')
}

try {
    def url1 = createURL()
} catch (all) {
    // A Groovy shortcut - we can omit the Exception Class if we want to catch all Exception and descendant objects.
    // This is equivalent to catch (Exception all) {} in Java
    assert true
    assert all in MalformedURLException
}

println "---- End of program ----"

