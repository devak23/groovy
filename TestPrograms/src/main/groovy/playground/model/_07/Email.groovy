package playground.model._07

class Email {
    String prospectName
    String emailAddress
    Date sendDate
    String notes

    String getContents() {
        "Recepient: $prospectName, helpers._16.Email: $emailAddress, Date: $sendDate, Summary: $notes"
    }
}
