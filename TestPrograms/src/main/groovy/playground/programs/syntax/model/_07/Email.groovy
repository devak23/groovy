package playground.programs.syntax.model._07

class Email {
    String prospectName
    String emailAddress
    Date sendDate
    String notes

    String getContents() {
        "Recepient: $prospectName, EmailAddress: $emailAddress, Date: $sendDate, Summary: $notes"
    }
}
