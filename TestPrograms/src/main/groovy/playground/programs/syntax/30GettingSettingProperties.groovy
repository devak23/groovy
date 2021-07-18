package playground.programs.syntax


import playground.programs.syntax.model._30.Report

/**
 * Groovy allows us to set the properties with a simple = operator. This is not to say you can set variable directly.
 * Internally, it invokes the setter method of that object. Similarly, the dot (.) notation invokes the getter method
 * and allows you to access a property.
 */

def report = new Report()
report.name = "Baltran report"
assert "Baltran report" == report.name

report.setCreatedBy("Abhay")
assert "Abhay" == report.getCreatedBy()

println "---- End of program ----"
