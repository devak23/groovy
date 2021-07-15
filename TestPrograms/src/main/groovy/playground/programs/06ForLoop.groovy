package playground.programs

int opportunityOne = 1000
int opportunityTwo = 2000
int opportunityThree = 3000
int opportunityFour = 4000
int opportunityFive = 5000
int totalOpportunity = 0
List opportunities = [opportunityOne, opportunityTwo, opportunityThree, opportunityFour, opportunityFive]


for (int i=0; i<opportunities.size(); i++) {
    println "Found opportunity of ${opportunities[i]}"
    totalOpportunity += opportunities[i]
}

println "Total opportunity = $totalOpportunity"
println "========================================================"
println "Using a 'for-in loop'"
println "========================================================"
totalOpportunity = 0
for (int opportunity in opportunities) {
    println "Found opportunity of $opportunity"
    totalOpportunity += opportunity
}
println "Total opportunity = $totalOpportunity"

println "========================================================"
println "Using a lambda expession"
println "========================================================"
totalOpportunity = 0
opportunities.each {o -> {
    println "Found opportunity of $o"
    totalOpportunity += o
}}
println "Total opportunity = $totalOpportunity"
