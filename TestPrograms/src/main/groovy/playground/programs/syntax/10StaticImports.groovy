package playground.programs.syntax
/*
    We can assign the 'as keyword' to static imports.
*/

// static imports
import static java.net.HttpURLConnection.HTTP_OK // regular java static import
import static java.net.HttpURLConnection.HTTP_OK as okay
import static java.net.HttpURLConnection.setFollowRedirects as redirect

// non static import
import java.net.HttpURLConnection as Http


redirect false // This is equivalent to HttpURLConnection.setFollowRedirects(false)
assert !HttpURLConnection.followRedirects

def connection = (Http) 'https://www.google.com'.toURL().openConnection()
assert connection instanceof  HttpURLConnection
assert okay == connection.responseCode
assert HTTP_OK == connection.responseCode

println "---- End of program ----"


