package playground.programs.syntax.model._30

class Report {
    String name
    String createdBy

    String getName() {
        println "invoking the getter for name"
        return name
    }

    void setName(String name) {
        println "invoking the setter for name"
        this.name = name
    }

    String getCreatedBy() {
        println "invoking getter for createdBy"
        return createdBy
    }

    void setCreatedBy(String createdBy) {
        println "invoking setter for createdBy"
        this.createdBy = createdBy
    }
}
