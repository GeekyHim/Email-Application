# Email Application
This Java-based application automates the process of generating and managing email accounts for new hires. Designed for IT support administrators, it simplifies the process of creating personalized email accounts with features to manage mailbox capacities, set alternate emails, and securely handle passwords.

<h3>Key Features: </h3>

Dynamic Email Generation: Automatically creates email addresses using the format firstname.lastname@department.company.com, based on user input for department and company name.
Department Selection: Allows assignment to specific departments like Sales, Development, or Accounting. Leaves the field blank if none is selected.
Secure Password Generation: Generates random, secure passwords to ensure account safety.
Mailbox Management: Provides methods to set mailbox capacity and define alternate email addresses.
User Information Display: Includes methods to display the user's name, email, and mailbox capacity.
Implementation of OOP Concepts:
This project leverages the principles of Object-Oriented Programming (OOP) to ensure clean, maintainable, and reusable code:

<h4>Encapsulation and Data Hiding: </h4>
Critical data fields such as password, mailboxCapacity, and alternateEmail are private, ensuring they are accessible only through controlled getter and setter methods. This safeguards sensitive information and promotes secure interactions.

<h4>Modularity: </h4>
Classes like Email and EmailApp are separated, each handling distinct responsibilities. The Email class manages core logic, while the EmailApp class handles user interaction and application flow.

<h4>Dynamic Behavior through Methods:</h4>
The randomPassword() method demonstrates dynamic behavior by generating a random password based on user-defined criteria. Similarly, setDepartment() and showInformation() provide flexible, reusable methods to handle department input and display information.

<h4>Getting Started:</h4>

1. Clone the repository.
2. Run the EmailApp class in your preferred IDE or terminal.
3. Follow the prompts to create email accounts for new employees.
