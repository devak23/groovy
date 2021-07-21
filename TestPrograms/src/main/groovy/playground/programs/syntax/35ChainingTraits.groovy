package playground.programs.syntax

import playground.programs.syntax.model._35.StringTransformer

/**
 * We can chain the traits using the so called 'Stackable traits feature'. This means a trait can delegate to another
 * trait or we can stop the delegation base based on a condition. Inside the method implementation of a trait we can
 * use super.method() to delegate to the next trait (if available) in the trait chain. If we don't use super.method()
 * the chain is stopped.
 */

def transformer = new StringTransformer(value: "mrAbhay")
assert "ABHAY" == transformer.value

println "---- End of program ----"

