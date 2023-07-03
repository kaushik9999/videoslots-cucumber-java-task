# videoslots-cucumber-java-task

# Task1 : Completed

 1. Task1 related .java files are under src/test org.videoslots.Task1 package.

# Task2 : Completed

  1. Task2 realated files under TestScenarios folder in the project root directory.
  2. Seperate text files are created for scenarios for each of the programs given in task1.
     
# Task3 : Completed
  I conducted ad-hoc testing for around 15-20 minutes on the videoslots website. The report for the bugs found during this testing can be found under ManualTestReport folder as a PDF document.
  The website says my IP is blocked for further access(after 15-20 min), due to which I aborted my testing at this point and reported only the bugs which I came across in the few minutes of testing I conducted.

# Task4 : Given Task

  1. Create an SQL Query which retrieves the id, name and surname of all registered users under country Malta.
  2. Create an SQL Query which retrieves the id, name, surname of all registered users that are NOT registered under country Portugal and France.
  3. Create an SQL Query which retrieves the id, name and surname of all registered users which are still active.
  4. Create an SQL Query which retrieves the name, surname and emails of all registered users which requires a reset password.

# Task4 : Completed Task

  Below are the queries written for task 4
  
  1. SELECT id, name, surname FROM users WHERE country=‘MT’.
  2. SELECT id, name, surname FROM users WHERE NOT country=’PT’ OR ‘FR’;
  3. SELECT id, name, surname FROM users u INNER JOIN users_creds uc ON u.id =uc.id;
  4. SELECT id, name, surname FROM users u INNER JOIN users_creds uc ON u.id =uc.id WHERE uc.required_rest_password=1;

# Task5 : Given Task

  Tests to be covered:
  1. Unsuccessful login using email
  2. Successful login using email
  3. Login and write a note followed by a logout
  4. Login again and make sure you open the note create in step 3

# Task5 : Completed Task
  Created a BDD Cucumber framework in java. Covered all the given tests.
  
  Framework explanation:
  1. All the feature files are under Featues folder inside src/test/resources.
  2. All the stepDefinitions are under org.videoslots.stepDefinitions package.
  3. All the pages/pageObject classes are under org.videoslots.pages package.
  4. All the common methods and framework utils are under org.videoslots.commonutils package.

  Run Instructions:
  
  From Command Line:
  1. Install java/maven/git and have the path set for all of them on your machine(mac/windows).
  2. Clone the repository.
  3. Navigate to the cloned directory.
  4. Run command 'mvn clean compile test' or 'mvn clean test' or  'mvn clean verify'
  5. All the test cases will be executed.

  From IDE:
  1. Clone the project.
  2. Import the project as maven project into any of the IDE(for ex: Eclipse).
  3. Right click on the project and run as maven clean, then maven install.
  4. Run maven test to execute tests with the help of maven.
  5. If you wish to run with the feature file, first install the cucumber plug in from the eclipse market place. 
  6. Convert the project into cucumber project if you encounter any issues(Right click on the project -> Configure -> Convert to Cucumber project).
  7. Open the feature file you wish to execute and run as cucumber feature. This will run all the test cases.

  From RunTests.bat
  1. An executable is created under this project for executing the tests.
  2. Inorder for this file to work, please make sure java/maven are installed on your machine and the path is properly set or exported.
  3. Executables are prone to be corrupted, that's why if you face any erros with the executable, please follow either of the above steps guide.

Note : 
  1. Please find the test case flow in the written feature file, EverNote.feature.
  2. If in case my credentials doesn't work for evernote, please update the creadentials under Properties/cofig.properties file. 
     
   
