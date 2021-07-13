package helpers

class Email {
    String prospectName
    String emailAddress
    Date sendDate
    String notes

    String getContents() {
        "Recepient: $prospectName, helpers.Email: $emailAddress, Date: $sendDate, Summary: $notes"
    }
}
