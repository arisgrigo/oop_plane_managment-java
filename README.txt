AM: 1115201800036

Εντολή για compile:

javac ./plane/*.java ./employee/*.java

Εντολή για run:

java plane/main

Πληροφοριές και αιτιολογήσεις:

Το πρόγραμμα αποτελείται από 2 packages:
1) Το plane στο οποίο περιέχονται οι κλάσεις main, PlaneComponent(abstract), PassengerCompartment, PrivateCompartment(abstract), EquipmentCompartment, CargoBay και Plane.
2) Το employee στο οποίο περιέχονται οι κλάσεις Employee(abstract), SecurityEmployee, MaintenanceEmployee, CleaningEmployee.

Δεν έκανα υλοποιήσεις των συναρτήσεων equal, clone και identical λόγω χρονικών περιορισμών.
Οι συναρτήσεις process καλόυν τις συναρτήσεις workOn.

PlaneComponent:
Οι συναρτήσεις ready_check, process είναι abstract αφού δεν έχουν νόημα για την κλάση PlaneComponent, αλλά για τις υποκλάσεις τους.

PassengerCompartment:
Εκτός από τις συναρτήσεις που ζητούνται υπάρχει και η inner_exists ή οποία επιστρέφει 1 αν υπάρχει εσωτερικό PassengerCompartment (0 αλλίως).

Plane:
Η ready_check τις αντίστοιχες συναρτήσεις των αντικειμένων από τα οποία αποτελείται.
Η process της Plane καλεί τις συναρτήσεις workOn για καθε αντικείμενο από το οποίο αποτελείται.


Για την κλάση Employee και τις υποκλάσεις της, εκτός από τα μέλη-δεδομένα που ζητούνται, περιλαμβάνω και τον int hasWorked, που λαμβάνει τιμή 1, μέσω της process της Plane. (Ο Employee καλείται από την process της Plane, και αφού γίνουν όλα τα workOn στην Plane, το hasWorked γίνεται 1 μέσω της worked()).
Το hasWorked ελέγχεται από την report() ή οποία εκτυπώνει ανάλογο μήνυμα με την τιμή της hasWorked.
Κάθε υποκλάση της Employee έχει μία workOn για κάθε Compartment στο οποίο καλείται να δουλέψει, ώστε να εκτυπόνται κατάλληλα μηνύματα.

Employee:
Οι συναρτήσεις workOn, worked, report και clone είναι abstract αφού δεν έχουν νόημα για την κλάση Employee, αλλά για τις υποκλάσεις τους.

