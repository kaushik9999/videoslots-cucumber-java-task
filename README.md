# videoslots-cucumber-java-task

# Task1 : COMPLETED

 1. Task1 related .java files are under src/test org.videoslots.Task1 package.

# Task2 : COMPLETED

  1. Task2 realated files under TestScenarios folder in the project root directory.
  2. Seperate text files are created for scenarios for each of the programs given in task1.
     
# Task3 : COMPLETED

# Task4 : GIVEN TASK

  1. Create an SQL Query which retrieves the id, name and surname of all registered users under country Malta.
  2. Create an SQL Query which retrieves the id, name, surname of all registered users that are NOT registered under country Portugal and France.
  3. Create an SQL Query which retrieves the id, name and surname of all registered users which are still active.
  4. Create an SQL Query which retrieves the name, surname and emails of all registered users which requires a reset password.

# Task4 : COMPLETED TASK

  Below are the queries written for task 4
  
  1. SELECT id, name, surname FROM users WHERE country=‘MT’.
  2. SELECT id, name, surname FROM users WHERE NOT country=’PT’ OR ‘FR’;
  3. SELECT id, name, surname FROM users u INNER JOIN users_creds uc ON u.id =uc.id;
  4. SELECT id, name, surname FROM users u INNER JOIN users_creds uc ON u.id =uc.id WHERE uc.required_rest_password=1;

# Task5 : GIVEN TASK

  Tests to be covered:
  1. Unsuccessful login using email
  2. Successful login using email
  3. Login and write a note followed by a logout
  4. Login again and make sure you open the note create in step 3

# Task5 : COMPLETED TASK
  Created a BDD Cucumber framework in java. Covered all the given tests.
  
  Framework explanation:
  1. 
