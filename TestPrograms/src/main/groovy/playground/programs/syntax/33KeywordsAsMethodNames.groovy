package playground.programs.syntax

import playground.programs.syntax.model._07.Email

/**
 * Normally we cannot use keywords as method names in Java. In groovy though, we can do that.
 */

def email = new Email(prospectName: "Abhay")

assert 'yahbA' == email.switch()


println "---- End of program ----"

