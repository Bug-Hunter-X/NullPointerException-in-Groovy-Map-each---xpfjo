# Groovy Map.each() NullPointerException

This repository demonstrates a common error in Groovy when using the `each` method on Maps with potentially null values.

The `bug.groovy` file shows the code that produces the `NullPointerException`.  The solution is in `bugSolution.groovy`.

This bug is subtle because the `NullPointerException` isn't always immediately obvious.  It often manifests when dealing with optional parameters or situations where a Map might not be initialized.