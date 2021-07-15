package playground.programs

import playground.model._07.Email


Email email = new Email()
email.prospectName = "Leaky Pipes Plumbing"
email.emailAddress = "joe.karl@leakypipes.com"
email.sendDate = new Date()
email.notes = "Send joe a list of pricing options for his spring ad campaign."

println email.getContents()