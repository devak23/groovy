package playground.programs.syntax

int myOpportunity = 500000

switch (myOpportunity) {
    case 0..999:
        println "The best approach for this opportunity is email."
        break
    case 1000..5000:
        println "The best approach for this opportunity is telephonic call."
        break
    default:
        println "The best approach for this opportunity is face to face meeting."
}
